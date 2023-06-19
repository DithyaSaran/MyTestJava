package studentaddress.encapsulation.aggregation;

public class DisplayAddress {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Student objstu=new Student();
		objstu.setName("Dithya Praseed");
		objstu.setRollno(12);
		
		Address objadd=new Address();
		objadd.setHousename("Dithya");
		objadd.setHouseno(121);
		objadd.setCity("Varkala");
		objadd.setDistrict("Tvm");
		objadd.setPincode(695310);
		objadd.setStd(objstu);
		objadd.print();
		
		
	}

}
