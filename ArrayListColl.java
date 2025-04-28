/*WAP to create ArrayList and perform following operation on it 
Case 1: add new data in ArrayList
Case 2: view all data from ArrayList
Case 3: Search Data using contains method 
Case 4: Search data using indexOf() method 
Case 5: delete data using index
Case 6: count total number of element from ArrayList
Case 7: check ArrayList  is empty or not 
*/

import java.util.*;
public class ArrayListColl
{
	public static void main(String args[]){
		Scanner sc= new Scanner(System.in);
		ArrayList al= new ArrayList();
		
		do{
			System.out.println("======================================================");
			System.out.println("1. add new data in ArrayList");
			System.out.println("2. view all data from ArrayList");
			System.out.println("3. Search Data using contains method");
			System.out.println("4. Search data using indexOf() method");
			System.out.println("5. delete data using index");
			System.out.println("6. count total number of element from ArrayList");
			System.out.println("7. check ArrayList  is empty or not");
			System.out.println("8. EXIT");
			System.out.print("\nEnter your choice: ");
			int choice= sc.nextInt();
			System.out.println("=====================================================");
			
			switch(choice)
			{
				case 1: //add new data in ArrayList
					System.out.println("Enter any value");
					int value= sc.nextInt();
					boolean b= al.add(value);
					if(b)
					{
						System.out.println("Value added Successfully");
					}
					else{
						System.out.println("Value not added");
					}
					break;
					
				case 2: //view all data from ArrayList
					Iterator i= al.iterator();
					while(i.hasNext())
					{
						Object obj= i.next();
						System.out.println(obj);
					}
					break;
					
				case 3: //Search Data using contains method
					System.out.println("Enter any value");
					value= sc.nextInt();
					b= al.contains(value);
					if(b)
					{
						System.out.println("Value Found");
					}
					else{
						System.out.println("Value not Found");
					}
					 break;
					 
				case 4: //Search data using indexOf() method
					System.out.println("Enter any value");
					value= sc.nextInt();
					int index= al.indexOf(value);
					if(index!=-1)
					{
						System.out.println("Value Present");
					}
					else{
						System.out.println("Value not Present");
					}
					break;
					
				case 5: //delete data using index
					System.out.println("Enter any value");
					value= sc.nextInt();
					index= al.indexOf(value);
					if(index!=-1)
					{
						Object obj= al.remove(index);
						System.out.println("Removed data: "+obj);
					}
					else{
						System.out.println("Not data found for delete");
					}
					break;
					
				case 6: //count total number of element from ArrayList
					System.out.println("Count of element is: "+al.size());
					break;
					
				case 7: //check ArrayList  is empty or not
					b= al.isEmpty();
					if(b)
					{
						System.out.println("ArrayList is Empty");
					}
					else {
						System.out.println("ArrayList not Empty");
					}
					break;
				
				case 8: //EXIT
					System.exit(0);
					break;
				
				default:
					System.out.println("Wrong Choice");
			}
		}while(true);
	}
}
