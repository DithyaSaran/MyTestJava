package exceptionexample;

import java.io.IOException;

public class ExceptionThrows {
	int result;
	public void calculation(int n1,int n2)
	{
		
		result=n1+n2;
	System.out.println("Result :" +result);
	
	
	try
	{
	if(result>=10)
	{
		throw new ArithmeticException();
	
	}
	else
	{
		throw new IOException();
	}
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
	

	public static void main(String[] args) {
		
		ExceptionThrows obj=new ExceptionThrows();
		obj.calculation(5, 5);
		
	
	
		}
	
		// TODO Auto-generated method stub

	}


