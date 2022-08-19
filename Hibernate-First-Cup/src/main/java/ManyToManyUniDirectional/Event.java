package ManyToManyUniDirectional;

import javax.persistence.*;

import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
public class Event {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	private String eventName;
	private String location;
	
	public Event() {
		
	}

	public Event(String eventName, String location) {
		super();
		this.eventName = eventName;
		this.location = location;
	}
	
	
}
