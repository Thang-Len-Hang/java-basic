package StudentCrudSaveAndPersist;

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

	public int save(Student student) {
		Transaction tx = session.beginTransaction();

		int id =(int)session.save(student);

		tx.commit();
		return id;
	}
}
