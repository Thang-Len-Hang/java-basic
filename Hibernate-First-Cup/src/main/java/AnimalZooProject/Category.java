package AnimalZooProject;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.*;

import org.hibernate.engine.jdbc.env.spi.IdentifierCaseStrategy;

import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
public class Category {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	private String categoryType;
	
	@OneToMany(mappedBy = "category",cascade = CascadeType.PERSIST)
	private List<Animal> animalList = new ArrayList<>();
	
	public Category() {
		
	}
	
	public void addAnimal(Animal animal) {
		animal.setCategory(this);
		animalList.add(animal);
	}

	public Category(String categoryType) {
		super();
		this.categoryType = categoryType;
	}
	
	
}
