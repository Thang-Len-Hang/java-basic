package StudentProjectHibernateSingleTable;

import javax.persistence.*;

import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
@DiscriminatorValue("EX_VET")
public class ExHouseVet extends Vet {
	
	private String country;
	private double visistingFees;
	
	public ExHouseVet() {
		
	}
	
	public ExHouseVet(String name, String qualification,String country, double visistingFees) {
		super(name,qualification);
		this.country = country;
		this.visistingFees = visistingFees;
	}

	
}
