package singlelevel.employee;

public class EmployeDisplay extends EmployeInput {
	
	String department;
	int dpid;
	
	public void display(String name, int id,String department, int dpid)
	{  
		this.name=name;
	    this.id=id;
		this.department=department;
		this.dpid=dpid;
	}
	public void print()

	{
		System.out.println("Name :" +name);
		System.out.println("Company Name :" +companyname);
		System.out.println("Employee Id :" +id);
		System.out.println("Department :" +department);
		System.out.println("Dept ID :" +dpid);
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		EmployeDisplay obj=new EmployeDisplay();
		//obj.input("Dithya",1);
		obj.display("Dithya",1,"Testing", 101);
		obj.print();
	}

}
