package StudentProjectHibernate;

import org.hibernate.Session;
import org.hibernate.SessionFactory;

import java.util.Arrays;
import java.util.List;

public class MainApplication {
	private static SessionFactory sessionFactory;

	static {
		sessionFactory = HibernateUtils
				.getSessionFactory(Arrays.asList(Province.class, Student.class, Subject.class, StudentSubject.class));
	}

	public static void main(String[] args) {

		try (Session session = sessionFactory.openSession()) {

			StudentDao obj = new StudentDao(session);

			obj.createDb();

			session.createQuery("select s from Student s", Student.class).getResultList().forEach(System.out::println);

			long studentCount = session
					.createQuery("select count (s) from StudentSubject s where s.subject.name = :subname", Long.class)
					.setParameter("subname", "Python").getSingleResult();
			System.out.println();
			System.out.println("Student::count " + studentCount);

			System.out.println();
			List list = session.createQuery("select p.provinceName, s.name, sub.name, st_sub.marks from "
					+ "Province p join p.studentList s join s.studentSubjectList st_sub join st_sub.subject sub where sub.name = :subname and st_sub.marks > :marks")
					.setParameter("marks", 70).setParameter("subname", "Java").getResultList();

			printQuery(list);

			String query = "select p.provinceName, s.name, s.gender, s.school, sub.name, st_sb.marks from Province p join p.studentList s join s.studentSubjectList st_sb join st_sb.subject sub where st_sb.marks = (select max(stu_sub.marks) from StudentSubject stu_sub where stu_sub.subject.name = :subname)";
			list = session.createQuery(query).setParameter("subname", "Java").getResultList();

			printQuery2(list);

		}

		JPAUtil.checkData("select * from province");
		JPAUtil.checkData("select * from student");
		JPAUtil.checkData("select * from subject");
		JPAUtil.checkData("select * from student_subject");

	}

	public static void printQuery(List<?> list) {
		for (Object object : list) {
			Object[] objects = (Object[]) object;
			System.out.println(String.format("ProvinceName: [%s], StudentName: [%s], Subjectname: [%s], Marks: [%s]",
					objects[0], objects[1], objects[2], objects[3]));
		}
	}

	public static void printQuery2(List<?> list) {
		for (Object object : list) {
			Object[] objects = (Object[]) object;
			System.out.println(String.format(
					"ProvinceName: [%s], StudentName: [%s], Gender: [%s], Schoolname: [%s], Subject: [%s], Marks: [%s]",
					objects[0], objects[1], objects[2], objects[3], objects[4], objects[5]));
		}
	}
}