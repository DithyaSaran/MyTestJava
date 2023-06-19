package student;

public class Department {
	String deptname;
	
	public void output(String dname)
	{
		deptname=dname;
		//System.out.println("Deparment Name: " +deptname);
	}
	public static void main(String[] args)
	{
		Department obj1=new Department();
		obj1.output("Computer Science");
	}

}
