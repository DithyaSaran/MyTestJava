package single.inheritance;

public class StudentClass extends DepartmentClass {

	String stdname;
	int rollno;
	float totalmark;
	
	public StudentClass(String stdname,int rollno,float totalmark,String deptname,int id)
	{
		this.stdname=stdname;
		this.rollno=rollno;
		this.totalmark=totalmark;
		this.deptname=deptname;
		this.id=id;
		
	}
	public void display()
	{
		System.out.println("Student Name :" +stdname);
		System.out.println("Roll No :" +rollno);
		System.out.println("Total mark Obtained :" +totalmark);
		
	}
	public static void main(String[] args) {
	
		StudentClass obj=new StudentClass("Dithya",12,85.5f,"Civil",001);
		obj.display();
		obj.print();
		// TODO Auto-generated method stub

	}

}
