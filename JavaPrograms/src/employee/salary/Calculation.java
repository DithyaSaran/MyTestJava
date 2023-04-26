package employee.salary;

public class Calculation extends Input {
	
	float hra,pf;
	public void calculate()
	{
		
		hra=(basicpay*5)/100;
		//System.out.println("HRA: " +hra);
		pf=(basicpay*20)/100;
		//System.out.println("PF : " +pf);
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	

}
}
