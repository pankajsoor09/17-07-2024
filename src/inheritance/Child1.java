package inheritance;

public class Child1 extends Parent1 {
	int number;
	public Child1 () {
		super();
		System.out.println("Child1 Default");
		
		System.out.println();
	}
	/*
	 * super statement is used to execute constructor of super /parent class 
	 * super() : is used to execute default constructor of super /parent class
	 * super(parameterized) : is used to execute parameterized constructor of super /parent class
	 * when super statement is not added then . the compiler will add super statement with not arguments to execute default constructor
	 * 
	 * 
	 *this statement : is used to execute constructors of same class
	 *this() : is used to execute default constructor of same class
	 *this (parameter) : is used to execute parameterized constructor of same class
	 */



	
	public Child1 (int number) {
		super(number);
		this.number = number;
		System.out.println("Child1 Parameterized");
		System.out.println("number : "+number);

	}
	public static void main(String[] args) {
		Child1 obj = new Child1 ();// it will go to default child and then in super.super is parent and in parent it will execute parent default 
		Child1 obj1 = new Child1 (111);// it will go to parameterized child and then in super.super is parent and in parent it will execute parent parameterized 
	}

}
