package exceptionexample;

public class TryCatch {

	public void operation(int n1,int n2) 
	{
		int div;
		int []arr=new int[5];
		try                                                 //exception handling
		{
		div=n1/n2;
		System.out.println("division :" +div);
		for(int i=0;i<=5;i++)
		{
			arr[i]=i+1;
			System.out.println(arr[i]+ " ");
		}
		}
		catch(ArithmeticException e )
		{
			System.out.println("Division by zero not possible");
		}
		
		catch(ArrayIndexOutOfBoundsException ex)
		{
			System.out.println("array index");
		}
		
		/*catch(Exception e)
		{
			System.out.println("Error Occurred");
		}*/
		
		finally
		{
			System.out.println("Finally Block");
		}
		
		System.out.println("end");
	}
	
	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		TryCatch obj=new TryCatch();
		obj.operation(10, 2);
		
	}

}
