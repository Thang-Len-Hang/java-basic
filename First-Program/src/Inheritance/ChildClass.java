package Inheritance;

public class ChildClass extends ParentClass {
	ChildClass(){
		super(3);
		
		publicInt = 3;
		protectedInt = 4;
		defaultInt = 8;
		//privateInt = 8;
	}
}
