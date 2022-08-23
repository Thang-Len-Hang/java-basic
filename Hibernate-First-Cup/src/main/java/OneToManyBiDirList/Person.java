package OneToManyBiDirList;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

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
	@JoinColumn(name = "person_id")
	@OneToMany(cascade = CascadeType.PERSIST)
	private List<Items> itemsList = new ArrayList<>();
	
	@OneToMany(mappedBy = "person",cascade = CascadeType.ALL)
	@OrderBy("model ASC")
	private Set<ToolBox> toolBoxSet = new HashSet<>();

	public void addItem(Items items) {
		items.setPerson(this);
		itemsList.add(items);
	}
	
	public void addToolBox(ToolBox toolBox) {
		toolBox.setPerson(this);
		toolBoxSet.add(toolBox);
	}

	public Person() {

	}

	public Person(String firstName, String lastName) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
	}

}
