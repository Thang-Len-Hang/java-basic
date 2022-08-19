package ManyToManyUniDirectional;

import org.hibernate.Session;
import org.hibernate.SessionFactory;

import java.util.Arrays;

public class MainApplication {
	private static SessionFactory sessionFactory;

	static {
		sessionFactory = HibernateUtils.getSessionFactory(Arrays.asList(Speaker.class,Event.class));
	}

	public static void main(String[] args) {
		try (Session session = sessionFactory.openSession()) {

			SpeakerDao obj = new SpeakerDao(session);
			obj.createDb();
		}

		JPAUtil.checkData("select * from speaker");
		JPAUtil.checkData("select * from event");
		JPAUtil.checkData("select * from speaker_event");
		JPAUtil.checkData("select * from speaker_experty");
	}
}