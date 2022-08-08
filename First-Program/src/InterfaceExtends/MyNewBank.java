package InterfaceExtends;

public class MyNewBank implements ILoan{

	@Override
	public double withDraw() {
		return 0;
	}

	@Override
	public double deposit(double amount) {
		return 0;
	}

	@Override
	public double loan() {
		return 0;
	}

}
