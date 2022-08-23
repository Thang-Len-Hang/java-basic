package OrderColumnDemo;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.*;

import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
public class Person {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;

	private String firstName;
	private String lastName;

	@OrderColumn(name = "index_column")
	@JoinTable(name = "person_items")
	@OneToMany(cascade = CascadeType.ALL)
	private List<Items> itemsList = new ArrayList<>();

	public void addItem(Items items) {
		itemsList.add(items);
	}

	public Person() {

	}

	public Person(String firstName, String lastName) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
	}

}
