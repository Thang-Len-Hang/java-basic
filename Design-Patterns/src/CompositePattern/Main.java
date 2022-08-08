package CompositePattern;

public class Main {

	public static void main(String[] args) {
		
		Composite CEO = new Composite("CEO");
		
		Composite MARKETING_MANAGER = new Composite("MARKTING MANAGER");
		Composite SALES_MANAGER = new Composite("SALES MANAGER");
		Composite HR_MANAGER = new Composite("HR MANAGER");
		
		Leaf markting_attendent1 = new Leaf("Markting Attendent 1");
		Leaf markting_attendent2 = new Leaf("Markting Attendent 2");
		
		Leaf sales_attendent1 = new Leaf("Sales Attendent 1");
		Leaf sales_attendent2 = new Leaf("Sales Attendent 2");
		
		CEO.addComponent(MARKETING_MANAGER);
		CEO.addComponent(SALES_MANAGER);
		CEO.addComponent(HR_MANAGER);
		
		MARKETING_MANAGER.addComponent(markting_attendent1);
		MARKETING_MANAGER.addComponent(markting_attendent2);
		
		SALES_MANAGER.addComponent(sales_attendent1);
		SALES_MANAGER.addComponent(sales_attendent2);
		
		CEO.printTree();
		
		AuditVisiter auditVisiter = new AuditVisiter();
		MARKETING_MANAGER.accept(auditVisiter);
		CEO.accept(auditVisiter);
		markting_attendent2.accept(auditVisiter);
	}

}
