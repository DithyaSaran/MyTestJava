package exceptionexample;

import java.io.IOException;

public class ExceptionPropogation {
	
	
		int result;
		public void calculation(int n1,int n2) throws IOException
		{
			
			result=n1+n2;
		System.out.println("Result :" +result);
		
		
		
		if(result>=10)
		{
			throw new ArithmeticException();
		
		}
		else
		{
			throw new IOException();
		}
		
		}
		public void print() throws IOException
		{
			calculation(5, 5);
			System.out.println("Result :" +result);
		}


	public static void main(String[] args) {
		

        ExceptionPropogation obj=new ExceptionPropogation();
		
		try
		{
		obj.print();
		}
	
	catch(ArithmeticException e)
	{
		
		System.out.println("result greater than 10");
	}
	catch(IOException ex)
	{
		System.out.println("result less than 10");
	}
		}
	
		// TODO Auto-generated method stub

	}



	


