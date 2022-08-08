package ProxyPattern;

public class VerboseGreetingProxy implements IGreeting {

	private IGreeting iGreeting;

	public VerboseGreetingProxy(IGreeting iGreeting) {
		this.iGreeting = iGreeting;
	}

	@Override
	public String greet(String name) {
		doSomethingExtra();
		return iGreeting.greet(name) + " How're you doing?";
	}
	
	private void doSomethingExtra() {
		System.out.println("Hey Hninn! Shinn is missi you!");
	}

}
