package encapsulation2;

import encapsulation1.Bank;

public class Customer {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Bank obj=new Bank();
		obj.setCustomeramt(5000);
		obj.setCustomername("Dithya");
		obj.calculate();
		System.out.println("Name :" +obj.getCustomername());
		System.out.println("Amount :" +obj.getCustomeramt());
		
	}

}
