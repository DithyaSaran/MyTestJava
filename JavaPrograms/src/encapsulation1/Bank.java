package encapsulation1;

public class Bank {
	private String customername;
	private int customeramt;

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	public String getCustomername() {
		return customername;
	}

	public void setCustomername(String customername) {
		this.customername = customername;
	}

	public int getCustomeramt() {
		return customeramt;
	}

	public void setCustomeramt(int customeramt) {
		this.customeramt = customeramt;
	}

public void calculate()
{
	float i;
	i=((customeramt*3*5)/100);
	customeramt+=i;
}
}

