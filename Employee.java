/* WAP to create class name as Employee with field id,name and salary 
and create array of object of size 5 and perform following operation on it.

Case 1: Add New Employee details 
Case 2: View all employee details
Case 3: Sort All employee records by using its id.
Case 4: Search employee by using name means you have 
to input the name of employee and search employee present in array or not */

import java.util.*;
class Employee1
{
	private int id,salary;
	private String name;
	
	public void setId(int id)
	{
		this.id=id;
	}
	public int getId()
	{
		return id;
	}
	public void setName(String name)
	{
		this.name=name;
	}
	public String getName()
	{
		return name;
	}
	public void setSalary(int salary)
	{
		this.salary=salary;
	}
	public int getSalary()
	{
		return salary;
	}
}
public class Employee
{
	public static void main(String args[]){
		Scanner sc= new Scanner(System.in);
		
		Employee1 e1[]= new Employee1[5];
		do{
			System.out.println("\nCase 1: Add New Employee details"); 
			System.out.println("Case 2: View all employee details");
			System.out.println("Case 3: Sort All employee records by using its id");
			System.out.println("Case 4: Search employee by using name ");
			System.out.print("Enter any choice: ");
			int choice= sc.nextInt();
			
			switch(choice)
			{
				case 1: //Add New Employee details 
					for(int i=0;i<e1.length;i++)
					{
						System.out.println("Enter employee id,name and salary");
						e1[i]= new Employee1();
						int id= sc.nextInt();
						sc.nextLine();
						String name= sc.nextLine();
						int salary= sc.nextInt();
						e1[i].setId(id);
						e1[i].setName(name);
						e1[i].setSalary(salary);
					}
					System.out.println("=================================================");
				break;
					
				case 2: //View all employee details
					System.out.println("\nEmployee details");
					System.out.println("Id"+" "+"Name"+" "+"Salary");
					for(Employee1 a: e1)
					{
						System.out.println(a.getId()+" "+a.getName()+"   "+a.getSalary());
					}
					System.out.println("=================================================");
				break;
				
				case 3: //Sort All employee records by using its id.
					for(int i=0;i<e1.length;i++)
					{
						for(int j=i+1;j<e1.length;j++)
						{
							if(e1[i].getId()> e1[j].getId())
							{
								Employee1 temp= e1[i];
										 e1[i]= e1[j];
										  e1[j]= temp;
							}
						}
					}
					
					for(Employee1 a: e1)
					{
						System.out.println(a.getId()+" "+a.getName()+" "+a.getSalary());
					}
					System.out.println("=================================================");
				break;
				
				case 4: //Search employee by using name
					System.out.print("Enter any employee name: ");
					sc.nextLine();
					String name1= sc.nextLine();
					boolean flag= false;
					for(Employee1 a: e1)
					{
						if(name1.equals(a.getName()))
						{
							flag= true;
							System.out.println(a.getId()+" "+a.getName()+" "+a.getSalary());
							break;
						}
						if(flag==true)
						{
							System.out.println("Employee present");
						}
						else{
							System.out.println("Employee not present");
							break;
						}
						
					}
					
					System.out.println("\n=================================================");
				break;
				
				default:
					System.out.println("wrong choice");
					System.out.println("=================================================");
					
			}
		}while(true);
	}
}
		

