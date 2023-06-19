package interfaceexample;

public class InterfaceDisplay implements InterfaceEg3{

	
	public void print()
	{
		System.out.println("Interface Method 1");
	
	}
	
	public int output(int n)
	{
		n+=MAX;
		
		System.out.println("value :" +n);
		return n;
		
	}
	public void display()
	{
		System.out.println("Interface Method 2");
		System.out.println(MAX);
	}
	public void display1()
	{
		System.out.println("Interface Method 3");
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		InterfaceDisplay obj=new InterfaceDisplay();
	
		obj.print();
		obj.output(25);
		obj.display();
		obj.display1();
	}

}
