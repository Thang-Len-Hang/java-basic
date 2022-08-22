package ManyToManyBiDirectional;

import org.hibernate.Session;
import org.hibernate.Transaction;

public class StudentDao {
	
	private Session session;

	public StudentDao(Session session) {
		super();
		this.session = session;
	}
	
	public void createDb() {
		
		Student s1 = new Student("Thaw Thaw",23,"ISM");
		Student s2 = new Student("Maw Maw",22,"ISY");
		Student s3 = new Student("Khaing Thuza",22,"ISM");
		
		Subject sub1 = new Subject("Java","6 months",250);
		Subject sub2 = new Subject("Python","3 months",200);
		Subject sub3 = new Subject("Groovy","2 months",150);
		
		s1.addSubject(sub1);
		s1.addSubject(sub2);
		s1.addSubject(sub3);
		
		s2.addSubject(sub1);
		
		s3.addSubject(sub1);
		
		Transaction tx = session.beginTransaction();
		
		session.persist(s1);
		session.persist(s2);
		session.persist(s3);
		
		tx.commit();
	}
}
