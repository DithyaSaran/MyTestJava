package superexample;

public class Child extends Parent{
	public Child(String name)
	{
		super(10);
		System.out.println("Child Constructor " +name);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Child obj=new Child("Dithya");
		
		
	}

}
