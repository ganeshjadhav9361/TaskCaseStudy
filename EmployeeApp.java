/*  Write a java Program to calculate overtime pay of 5 employees. The overtime pay rate is 
	Rs.50/- (per Hour). Daily shift hour time is only 8 hours. 
			
    Note- for a week only 40 hours of working are allowed. 
    1. Create class Employee with data member ID, Name, total working, salary, overtime
    Set Information by using a constructor and create a display Information() method to
    display all information with salary.
    2. Create Driver class name as OverTime with method setEmployee(Employee emp[]) and 
    void calculateOvertime() to calculate overtime. */
	
import java.util.*;
class Employee
{
	int id, total_working, salary, overtime;
	String name;

	Employee(int id,String name,int total_working)
	{
		this.id=id;
		this.name=name;
		this.total_working=total_working;
		this.salary= 0;
		this.overtime= 0;
	}
	
	void DisplayInformation()
	{
			System.out.println("\nEmployee id: "+id);
			System.out.println("Employee name: "+name);
			System.out.println("Employee total_working: "+total_working);
			System.out.println("Employee salary: "+salary);
			System.out.println("Employee overtime: "+overtime);
			System.out.println("=================================================");
	}
}

public class EmployeeApp
{
	static final int week_limit= 40;
	static final int daily_limit= 8;
	static final int overtime_rate= 50;
	
	public void setEmployee(Employee emp[])
	{
		Scanner sc= new Scanner(System.in);
		for(int i=0;i<emp.length;i++)
		{
			System.out.println("Enter Employee id,name,total_working");
			
			int id= sc.nextInt();
			sc.nextLine();
			String name= sc.nextLine();
			int total_working= sc.nextInt();
			emp[i]= new Employee(id,name,total_working);
		}
	}
	
	public void calculateOvertime(Employee emp[])
	{
		for(Employee e: emp)
		{
			if(e.total_working> week_limit)
			{
				e.overtime= e.total_working-week_limit;
				e.salary= e.overtime* overtime_rate;
			}
			else{
				e.overtime= 0;
				e.salary= 0;
			}
		}
	}
	
	public static void main(String args[]){
	
		Employee e1[]= new Employee[5];
		EmployeeApp e2= new EmployeeApp();
		
		e2.setEmployee(e1);
		e2.calculateOvertime(e1);
		for (Employee e : e1) {
			e.DisplayInformation();
        }
	}
}
		
	
