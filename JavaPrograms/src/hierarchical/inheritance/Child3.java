package hierarchical.inheritance;

public class Child3 extends Parent {
	public void child3method()
	{
		System.out.println("Child3 Class Method");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Child3 obj3=new Child3();
		obj3.child3method();
		obj3.parentmethod();
	}
	

}
