class Employee
{
	int eNo;
	String eName;
	double eSalary;
}
public class arrayofEmp
{
	public static void main(String[] args)
	{
		Employee E1=new Employee();
		E1.eNo=1;
		E1.eName="josu";
		E1.eSalary=4000;
		
		Employee E2=new Employee();
		E2.eNo=2;
		E2.eName="hamna";
		E2.eSalary=6000;
		
		Employee E3=new Employee();
		E3.eNo=3;
		E3.eName="abhi";
		E3.eSalary=8000;
		
		Employee[] employees=new Employee[3];
		employees[0]=E1;
		employees[1]=E2;
		employees[2]=E3;
		
		for(int i=0;i<employees.length;i++)
		{
			System.out.println(employees[i].eNo+":"+employees[i].eName+":"+employees[i].eSalary);
		}
	}
}
		
		
	

