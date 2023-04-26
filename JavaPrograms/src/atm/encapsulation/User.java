package atm.encapsulation;
import java.util.*;
public class User {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num;
		
		Scanner s=new Scanner(System.in);
		System.out.println("WELCOME TO BANK");
		System.out.println("ENTER YOUR PIN");
		num=s.nextInt();
		
		Bank obj=new Bank();
		obj.setPin1(1001);
		obj.setPin2(1234);
		obj.setPin3(1212);
		obj.validate(num);
		obj.getPin1();
		obj.getPin2();
		obj.getPin3();
		
		//System.out.println("PIN YOU HAVE ENTERED IS :" +obj.getPin1());
		//System.out.println("PIN YOU HAVE ENTERED IS :" +obj.getPin2());
		//System.out.println("PIN YOU HAVE ENTERED IS :" +obj.getPin3());
	}

}
