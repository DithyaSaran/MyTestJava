package employeeprogram;

public class Employee {
String name;
int id;
float salary;

public Employee(String empname, int empid, float empsalary)
{
	name=empname;
	id=empid;
	salary=empsalary;
}

public void display()
{
	System.out.println("Employee Name :" +name);
	System.out.println("Employee Id :" +id);
	System.out.println("Employee Salary :" +salary);
}

	public static void main(String[] args) {
		Employee obj=new Employee("Dithya", 001, 25000f);
		obj.display();
		
		// TODO Auto-generated method stub

	}

}
