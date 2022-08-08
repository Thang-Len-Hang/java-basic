

	
	class A{
		
	}
	
	class Outer extends A{
		private int i;
		
		public void test() {
			class localInner{ // local inner class
				public void local() {
					System.out.println("Local");
				}
			}
			localInner localInner = new localInner();
			localInner.local();
			
			System.out.println("Outer test:");
			
		}
		
		static class StaticInner{
			public void cal() {
				System.out.println("Static Inner Class.");
			}
		}
		
		class Inner{ //inner class can be assigned any modifiers
			public void doSomething() {
				System.out.println(i);
			}
		}
		
	}
	
	public class Main {
	
	public static void main(String[] args) {
			
		//Outer outer = new Outer();
		Outer.Inner inner = new Outer().new Inner();
		inner.doSomething();
		
		Outer.StaticInner staticInner = new Outer.StaticInner();
		staticInner.cal();
		
		GreetingInterface obj = new GreetingInterface() {

			@Override
			public String greet(String name) {

				return "Hello!"+name;
			}
			
		};
		GreetingInterface obj3 = a -> "Hey Coder" + a;// using lambda to replace anonymous class
		
		System.out.println(obj.greet("Han"));
		
		GreetingInterface obj2 = new MyClass();
		System.out.println(obj2.greet("John"));
	}

}

class MyClass implements GreetingInterface{

	@Override
	public String greet(String name) {
		
		return "How're you ";
	}
	
}

interface GreetingInterface{
	String greet(String name);
}

