package studentaddress.encapsulation.aggregation;

public class Address {
	private String housename;
	private int houseno;
	private String city;
	private String district;
	private int pincode;
	private Student std;
	

	public Student getStd() {
		return std;
	}



	public void setStd(Student std) {
		this.std = std;
	}



	public String getHousename() {
		return housename;
	}



	public void setHousename(String housename) {
		this.housename = housename;
	}



	public int getHouseno() {
		return houseno;
	}



	public void setHouseno(int houseno) {
		this.houseno = houseno;
	}



	public String getCity() {
		return city;
	}



	public void setCity(String city) {
		this.city = city;
	}



	public String getDistrict() {
		return district;
	}



	public void setDistrict(String district) {
		this.district = district;
	}



	public int getPincode() {
		return pincode;
	}



	public void setPincode(int pincode) {
		this.pincode = pincode;
	}


	public void print()
	{
		System.out.println("Name :" +std.getName());
		System.out.println("Roll Number :" +getStd().getRollno());
		System.out.println("House Name :" +getHousename());
		System.out.println("House Number :" +getHouseno());
		System.out.println("City :" +city);
		System.out.println("District :" +getDistrict());
		System.out.println("Pincode :" +getPincode());
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
