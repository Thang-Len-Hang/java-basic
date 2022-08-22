package AnimalZooProject;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.*;

import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
@Table(name = "Food_Item")
public class FoodItem {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	private String name;
	private double quantity;
	
	@ManyToMany(mappedBy = "foodItemList",cascade = CascadeType.PERSIST)
	private List<Animal> animalList = new ArrayList<>();
	
	@ManyToOne
	private Supplier supplier;

	public FoodItem() {

	}
	
	

	public FoodItem(String name, double quantity) {
		super();
		this.name = name;
		this.quantity = quantity;
	}

}
