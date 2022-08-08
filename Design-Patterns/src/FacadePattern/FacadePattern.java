package FacadePattern;

public class FacadePattern {

	public static void main(String[] args) {
		
		SupplierFacadeLocal supplierFacadeLocal = new SupplierFacade();
		supplierFacadeLocal.create(new Supplier());
	}

}
