package FacadePattern;

public abstract class AbstractFacade <T> {
	
	private Class<T> entityClass;
	
	public AbstractFacade(Class<T> entityClass) {
		super();
		this.entityClass = entityClass;
	}

	public void create(T t) {
		System.out.println(t.getClass().getSimpleName()+" :: created");
	}
	
	public void delete(T t) {
		System.out.println(t.getClass().getSimpleName()+" :: deleted");
	}
}
