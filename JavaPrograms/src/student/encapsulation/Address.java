package student.encapsulation;

public class Address {
	
	String housename;
	int houseno;
	String city;
	String district;
	int pincode;
	Student std;
	
	public Address(String housename, int houseno, String city, String district,int pincode,Student std)
	{
		this.housename=housename;
		this.houseno=houseno;
		this.city=city;
		this.district=district;
		this.pincode=pincode;
		this.std=std;
	}

	
	public void print()
	{
		System.out.println("Name :" +std.name);
		System.out.println("Roll Number :" +std.rollno);
		System.out.println("House Name :" +housename);
		System.out.println("House Number :" +houseno);
		System.out.println("District :" +district);
		System.out.println("Pincode :" +pincode);
	
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
