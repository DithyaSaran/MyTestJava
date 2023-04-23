package addition.result;

public class Divisibility extends AddNumbers {
	
	public void display()
	{
		int number;
		
		number=super.add();
		if(number % 10==0)
		{
			System.out.println("Divisible by 10");
		}
		else
		{
			System.out.println("Not divisible by 10 ");
		}
			
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int res;
		Divisibility obj=new Divisibility();
		obj.input(10,20);
		res=obj.add();
		System.out.println("Addition of given numbers " +res);
		obj.display();
		
	}
	

}
