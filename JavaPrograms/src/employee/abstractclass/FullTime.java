package employee.abstractclass;


public class FullTime extends Employee{
	
	int totalPay;
	
	public void calculateSalary()
	{
		
		 totalPay=1000*HOURS;
		System.out.println("Total Payment for 8 hours working Employee :" +totalPay);
		
		 
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
