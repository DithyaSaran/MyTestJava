package multilevel.vehicle;

public class CarRate extends CarSpec {
	int amt;
	public void rate(int amt)
	{
		this.amt=amt;
		System.out.println("Rate : " +amt);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CarRate obj=new CarRate();
		obj.company();
		obj.spec();
		obj.rate(5000000);
		

	}

}
