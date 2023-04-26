package employee.abstractclass;

import java.util.Scanner;

public class Contractor extends Employee {

	int totalPay;
	int payhr=500;
    static  int input;
	
	
	public void contractordetails()
	{

		Scanner s=new Scanner(System.in);
		System.out.println("1 : Part Time");
		System.out.println("2 : Full Time");
		System.out.println("Select type of job");
		input=s.nextInt();
	}
	
	public void calculateSalary()
	{
		
		if(input==1)
		{
			Scanner s=new Scanner(System.in);
			System.out.println("Enter your Part time working hours : " );
			emphrs=s.nextInt();
			totalPay=payhr*emphrs;
			System.out.println("Payment for working hours :" +totalPay );
		}
		else
		{
			FullTime obj2=new FullTime();
			obj2.calculateSalary();
			
		}	
			
	}
	public static void main(String[] args) {
		
		Contractor obj1=new Contractor();
		obj1.print();
		obj1.contractordetails();
		obj1.calculateSalary();
		
		
}
}
