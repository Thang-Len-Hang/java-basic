package OneToManyBiDirList;

import java.util.HashSet;
import java.util.Objects;
import java.util.Set;

import javax.persistence.*;

import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
@Table(name = "tool_box")
public class ToolBox {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;

	private String manufacturer;
	private String model;
	
	@ManyToOne
	private Person person;

	public ToolBox() {

	}

	public ToolBox(String manufacturer, String model) {
		super();
		this.manufacturer = manufacturer;
		this.model = model;
	}

	@Override
	public int hashCode() {
		return Objects.hash(model);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		ToolBox other = (ToolBox) obj;
		return Objects.equals(model, other.model);
	}
	
	

}
