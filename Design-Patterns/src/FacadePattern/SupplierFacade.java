package FacadePattern;

public class SupplierFacade extends AbstractFacade<Supplier> implements SupplierFacadeLocal{
	
	public SupplierFacade() {
		super(Supplier.class);
	}
}
