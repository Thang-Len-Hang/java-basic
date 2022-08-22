package AnimalZooProject;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.*;

import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
public class Supplier {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	private String name;
	private String contactNumber;
	private String address;
	
	@OneToMany(mappedBy = "supplier",cascade = CascadeType.PERSIST)
	private List<FoodItem> foodItemList = new ArrayList<>();
	
	public void addFoodItem(FoodItem foodItem) {
		foodItem.setSupplier(this);
		foodItemList.add(foodItem);
	}
	
	public Supplier() {
		
	}

	public Supplier(String name, String contactNumber, String address) {
		super();
		this.name = name;
		this.contactNumber = contactNumber;
		this.address = address;
	}
	
	
}
