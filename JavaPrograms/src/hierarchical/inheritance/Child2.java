package hierarchical.inheritance;

public class Child2 extends Parent{
	public void child2method()
	{
		System.out.println("Child2 Class Method");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Child2 obj2=new Child2();
		obj2.child2method();
		obj2.parentmethod();

	}
	

}
