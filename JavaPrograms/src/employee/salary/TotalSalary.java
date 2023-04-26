package employee.salary;

public class TotalSalary extends Calculation {
	float total;
	public void totalsal()
	{
		total=(basicpay+hra-pf-deduction+bonus);
	}
	
	public void print()
	{
		System.out.println("Salary Slip");
		System.out.println("HRA: " +hra);
		System.out.println("PF : " +pf);
		System.out.println("Basic Pay : " +basicpay);
		System.out.println("Deduction : " +deduction);
		System.out.println("Bonus : " +bonus);
		System.out.println("");
		System.out.println("Total Salary : " +total);
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		TotalSalary obj1=new TotalSalary();
		//System.out.println("Salary Slip");
		//System.out.println("");
		obj1.inputmethod(20000,500,1000);
		obj1.calculate();
		obj1.totalsal();
		obj1.print();
		
	}

}
