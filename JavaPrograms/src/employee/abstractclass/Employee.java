package employee.abstractclass;

import java.util.Scanner;

public abstract class Employee {
	
	String empname;
	String empcompany="OBSQURA";
	int id;
	int emphrs;
	int extrahrs;
	final int HOURS=8;
	
		
		public void print()
		{
			Scanner s=new Scanner(System.in);
			System.out.println("Company : " +empcompany);
			System.out.println("Enter Employee Name" );
			empname=s.nextLine();
			System.out.println("Enter Employee ID :");
			id=s.nextInt();
			
		}
	

	public abstract void calculateSalary();
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
