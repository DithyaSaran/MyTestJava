package inher;

public class Child extends Parent{

	public void parentMethod()
	{
		super.parentMethod();
		
		System.out.println(" This is child class");
	}
	public static void main(String[] args) {
		
		Child obj=new Child();
		obj.parentMethod();
	}
}
