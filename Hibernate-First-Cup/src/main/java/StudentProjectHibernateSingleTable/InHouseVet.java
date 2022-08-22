package StudentProjectHibernateSingleTable;

import javax.persistence.*;

import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
@DiscriminatorValue("IN_VET")
public class InHouseVet extends Vet{
	
	private double salary;
	
	public InHouseVet() {
		
	}
	
public InHouseVet(String name, String qualification, double salary) {
		super(name,qualification);
		this.salary = salary;
		
	}
	
}
