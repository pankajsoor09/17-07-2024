package inheritance;

public class Child extends Parent {
	
	public Child () {
		System.out.println("Child Default ");
	}
		public static void main(String[] args) {
			Child obj = new Child();
		}
	}
	
/*
 * super statement is used to execute constructor of super /parent class 
 * super() : is used to execute default constructor of super /parent class
 * super(parameterized) : is used to execute parameterized constructor of super /parent class
 * when super statement is not added then . the compiler will add super statement with not arguments to execute default constructor
 */


