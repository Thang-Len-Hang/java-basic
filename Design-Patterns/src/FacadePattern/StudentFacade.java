package FacadePattern;

public class StudentFacade extends AbstractFacade<Student> implements StudentFacadeLocal {
	public StudentFacade() {
		super(Student.class);
	}
	
}
