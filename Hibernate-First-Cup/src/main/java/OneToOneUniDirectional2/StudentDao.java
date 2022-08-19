package OneToOneUniDirectional2;

import org.hibernate.Session;
import org.hibernate.Transaction;

public class StudentDao {
	private Session session;

	public StudentDao(Session session) {
		this.session = session;
	}

	public void createDb() {
		Province province1 = new Province("Sule");
		Province province2 = new Province("Dream Land");
		Province province3 = new Province("Love Land");
		Student s1 = new Student("John Doe", 23, "Latha");

		Student s2 = new Student("John William", 23, "ISM");
		Student s3 = new Student("John Updike", 23, "ISY");

		/*
		 * s1.setProvince(province1); province1.setStudent(s1);
		 */
		s1.addProvince(province1);

		/*
		 * s2.setProvince(province2); province2.setStudent(s2);
		 */
		s2.addProvince(province2);

		/*
		 * s3.setProvince(province3); province3.setStudent(s3);
		 */
		s3.addProvince(province3);

		Transaction tx = session.beginTransaction();

		/*
		 * session.persist(province1); session.persist(province2);
		 * session.persist(province3);
		 */

		session.persist(s1);
		session.persist(s2);
		session.persist(s3);

		tx.commit();
	}
}
