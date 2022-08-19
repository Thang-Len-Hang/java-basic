package ManyToManyUniDirectional;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.Transaction;

public class SpeakerDao {
	
	private Session session;

	public SpeakerDao(Session session) {
		super();
		this.session = session;
	}
	
	public void createDb() {
		
		Speaker speaker1 = new Speaker("John Doe","BSc");
		
		Speaker speaker2 = new Speaker("Richard Chan","BSc");
		speaker2.getExperties().add("Java");
		speaker2.getExperties().add("Python");
		
		Speaker speaker3 = new Speaker("John William","MSc");
		speaker3.getExperties().add("Java");
		
		Event event1 =new Event("JavaOne","Japan");
		Event event2 =new Event("Pycham","NewYork");
		Event event3 =new Event("HolyGrails","India");
		
		speaker1.getEvents().add(event1);
		speaker1.getEvents().add(event2);
		speaker1.getEvents().add(event3);
		
		speaker2.getEvents().add(event1);
		
		speaker3.getEvents().add(event1);
		
		Transaction tx = session.beginTransaction();
		
		session.persist(speaker1);
		session.persist(speaker2);
		session.persist(speaker3);
		
		tx.commit();
		
	}
}
