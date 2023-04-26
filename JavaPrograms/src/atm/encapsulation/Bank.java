package atm.encapsulation;

public class Bank {
	
	private int pin1,pin2,pin3;
	
	
	public int getPin1() {
		return pin1;
	}

	public void setPin1(int pin1) {
		this.pin1 = pin1;
	}

	public int getPin2() {
		return pin2;
	}

	public void setPin2(int pin2) {
		this.pin2 = pin2;
	}

	public int getPin3() {
		return pin3;
	}

	public void setPin3(int pin3) {
		this.pin3 = pin3;
	}

	public void validate(int num)
	{
		
			if(num==pin1)
			{
			System.out.println("PIN ACCEPTED" );
			
			}
			else if(num==pin2)
			{
			System.out.println("PIN ACCEPTED");
			}
			else if(num==pin3)
			{
			System.out.println("PIN ACCEPTED");
			}
			else
			{
			System.out.println("YOU HAVE ENTERED INCORRECT PIN");
			}
			
	}

}

	






	
		
	


