package StudentCrud;

import org.hibernate.Session;
import org.hibernate.Transaction;

public class StudentDAO {
	private Session session;

	public StudentDAO(Session session) {
		this.session = session;
	}

	public Student create(Student student) {
		Transaction tx = session.beginTransaction();
		session.save(student);
		tx.commit();
		return student;

	}
}
