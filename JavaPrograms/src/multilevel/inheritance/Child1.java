package multilevel.inheritance;

public class Child1 extends Intermediate {
	public void childmethod()
	{
		System.out.println("Child Class Method");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println("Child Class Object");
		Child1 obj=new Child1();
		obj.childmethod();
		obj.intermethod();
		obj.parentmethod();
		System.out.println("");
		
		System.out.println("Intermediate Class Object");
		Intermediate obj1=new Intermediate();
		obj1.intermethod();
		obj1.parentmethod();
		System.out.println("");
		
		System.out.println("Parent Class Object");
		Parent1 obj2=new Parent1();
		obj2.parentmethod();
		
		
	}

}
