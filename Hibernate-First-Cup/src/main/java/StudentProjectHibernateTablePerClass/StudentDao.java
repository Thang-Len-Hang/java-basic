package StudentProjectHibernateTablePerClass;

import java.time.LocalDate;

import org.hibernate.Session;
import org.hibernate.Transaction;

public class StudentDao {

	private Session session;

	public StudentDao(Session session) {
		super();
		this.session = session;
	}

	public void createDb() {

		Province province1 = new Province("Sule");
		Province province2 = new Province("SO");
		Province province3 = new Province("NO");
		Province province4 = new Province("Tamwe");

		Student student1 = new Student("Thaw Thaw", Gender.MALE, LocalDate.of(2010, 3, 12), "ISY");
		Student student2 = new Student("Thu Thu Thaw", Gender.FEMALE, LocalDate.of(209, 3, 12), "UMI");
		Student student3 = new Student("Thuza Nwe", Gender.FEMALE, LocalDate.of(2011, 3, 12), "IMU");
		Student student4 = new Student("Thuza Oo", Gender.FEMALE, LocalDate.of(2011, 3, 12), "ISY");

		Subject subject1 = new Subject("Java", "6 months", 400.0);
		Subject subject2 = new Subject("Python", "4 months", 200.0);
		Subject subject3 = new Subject("Ruby", "3 months", 300.0);
		Subject subject4 = new Subject("Scala", "5 months", 250.0);

		StudentSubject studentSubject1 = new StudentSubject(90);
		StudentSubject studentSubject2 = new StudentSubject(80);
		StudentSubject studentSubject3 = new StudentSubject(85);
		StudentSubject studentSubject4 = new StudentSubject(75);
		StudentSubject studentSubject5 = new StudentSubject(70);
		StudentSubject studentSubject6 = new StudentSubject(80);
		StudentSubject studentSubject7 = new StudentSubject(90);

		province1.addStudent(student1);
		province2.addStudent(student2);
		province3.addStudent(student3);
		province4.addStudent(student4);

		student1.add(studentSubject1);
		subject1.addStudentSubject(studentSubject1);

		student1.add(studentSubject2);
		subject2.addStudentSubject(studentSubject2);

		student1.add(studentSubject3);
		subject3.addStudentSubject(studentSubject3);

		student2.add(studentSubject4);
		subject1.addStudentSubject(studentSubject4);
		
		student2.add(studentSubject7);
		subject2.addStudentSubject(studentSubject7);

		student3.add(studentSubject5);
		subject1.addStudentSubject(studentSubject5);

		student4.add(studentSubject6);
		subject4.addStudentSubject(studentSubject6);
		
		
		
		ExHouseVet exHouseVet1 = new ExHouseVet("Thaw Thaw","MSc","Thailand",500);
		ExHouseVet exHouseVet2 = new ExHouseVet("Ma Ma","MSc","Thailand",200);
		InHouseVet inHouseVet1 = new InHouseVet("John Doe","MSc",500);
		InHouseVet inHouseVet2 = new InHouseVet("Thomas Hardy","MSc",600);
		

		Transaction tx = session.beginTransaction();
		
		session.persist(student1);
		session.persist(student2);
		session.persist(student3);
		session.persist(student4);
		
		
		session.persist(exHouseVet1);
		session.persist(exHouseVet2);
		session.persist(inHouseVet1);
		session.persist(inHouseVet2);
		
		tx.commit();

	}
}
