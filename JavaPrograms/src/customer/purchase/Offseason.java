package customer.purchase;

import java.util.Scanner;

public class Offseason extends Onseason {
	int a,b,c;      
	
	public void items(int a1,int b1, int c1)
	{
		a=a1;
		b=b1;
		c=c1;
	}
	
	public void totalamt()
	{
		total=a+b+c;
		System.out.println("Total Amount : " +total);
	}
	public void discount()
	{
		int season;
			Scanner s=new Scanner(System.in);
			System.out.println("1 : Onseason");
			System.out.println("2 : Offseason");
			System.out.println("Enter season");
			season=s.nextInt();
		 
		if(season==1)
		{
			System.out.println("You are getting 15% discount");	
			dis=(total*15)/100;
			 
		}
		 else
		 {
			 super.discount();
			 System.out.println("You are getting 40% discount");
			 
		 }
		
	}
	public void print()
	{
		total-=dis;
		System.out.println("Total Amount after discount: " +total);
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n1,n2,n3;
		Offseason obj=new Offseason();
		obj.items(1000,1525,500);
		obj.totalamt();
		
		obj.discount();
		obj.print();
		
		
		
		
	}

}
