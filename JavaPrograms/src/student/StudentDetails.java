package student;

public class StudentDetails extends Department {
	
	int rollno;
	String name;
	
	public void input(String stuname, int roll)
	{
		rollno=roll;
		name=stuname;
		
	}
	
	public void display()
	{
		output("cs");
		System.out.println("name :" +name);
		System.out.println("rollno :" +rollno);
		System.out.println("Deparment Name: " +deptname);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
StudentDetails obj= new StudentDetails();
obj.input("Dithya", 01);
obj.display();
//obj.output("cn");




	}

}
