package OrderColumnDemo;

import javax.persistence.*;

import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
public class Items {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;

	private String name;
	private String description;

	public Items() {

	}

	public Items(String name, String description) {
		super();
		this.name = name;
		this.description = description;
	}

}
