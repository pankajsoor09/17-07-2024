package inheritance;

public class Child2 extends Parent1 {
	int number;
	public Child2 () {
		super(100);
		System.out.println("Child2 Default");
		
		System.out.println("-----------------------------");
	}
	
	public Child2 (int number) {
		this();
		this.number = number;
		System.out.println("Child2 Parameterized");
		System.out.println("number : "+number);

	}
	public static void main(String[] args) {
		Child2 obj = new Child2 ();
		Child2 obj1 = new Child2 (111);
		
/*
Parent Parameterizes |
number 100           |  for -->Child2 obj = new Child2 ();
 Child2 Default      |
-----------------------------
Parent Parameterizes     |
number 100               |
Child2 Default           | for --> Child2 obj1 = new Child2 (111);
                         |
Child2 Parameterized     |
number : 111             |
*/
	}

}
