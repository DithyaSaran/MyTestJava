package interface1.assignment;

import java.util.Scanner;

public class HdfcBank implements ReserveBank{

	 float p;
	 int n;
	 int t;
	float mamount;
	float cinterest;
	
	public void deposit()
	{
		Scanner s=new Scanner(System.in);
		System.out.println("Enter monthly installment");
		p=s.nextFloat();
		System.out.println("Enter duration in months");
		n=s.nextInt();
		System.out.println("Enter number of times interest is compounded");
		t=s.nextInt();
		
	}
	
	public void maturityamount()
	
	{
		
		mamount=p*(1+R/n)*n*t;
		//mamount=p*n+p*((n*(n+1))/2)*(R/100)*(1/12);
		cinterest=mamount-p;
	}
	
	public void display()
	
	{
		float total=p*n;
		System.out.println("Total Investment: " +total);
		System.out.println("Rate : " +R);
		System.out.println("Compound Interest after " + n + " months :" +cinterest);
		System.out.println("Maturity Amount : " +mamount);
		
	}
	
	public static void main(String[] args) {
		
		HdfcBank obj=new HdfcBank();
		obj.deposit();
		obj.maturityamount();
		obj.display();
		
		// TODO Auto-generated method stub

	}

}
