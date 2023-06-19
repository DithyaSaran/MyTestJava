package student.encapsulation;

public class Display {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		Student objstu=new Student("Dithya Praseed",1);
		Address objadd=new Address("Dithya",101,"Varkala","TVM",695310,objstu);
		objadd.print();
	}

}
