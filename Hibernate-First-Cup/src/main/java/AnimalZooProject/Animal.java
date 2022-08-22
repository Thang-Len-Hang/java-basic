package AnimalZooProject;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.*;

import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
public class Animal {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	private String type;
	private int totalNumber;
	
	@ManyToOne
	private Category category;
	
	@OneToOne
	private Cage cage;
	
	@ManyToMany
	private List<FoodItem> foodItemList = new ArrayList<>();
	
	public Animal() {
		
	}
	
	public void addCage(Cage cage) {
		cage.setAnimal(this);
		this.cage = cage;
	}

	public Animal(String type, int totalNumber) {
		super();
		this.type = type;
		this.totalNumber = totalNumber;
	}
	
	
}
