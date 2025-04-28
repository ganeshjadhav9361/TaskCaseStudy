/* WAP to create LinkedList and perform the following operation on it.
	Case 1: add Node at first 
	Case 2: add Node at last 
	Case 3: remove node from first 
	Case 4: remove node from last 
	Case 5: view all data from linked list
*/

import java.util.*;
public class LinkedListApp {
	
	public static void main(String args[]) {
		Scanner sc= new Scanner(System.in);
		LinkedList list= new LinkedList();
		
		do{ 
			System.out.println("====================================================");
			System.out.println("1. add Node at first");
			System.out.println("2. add Node at last");
			System.out.println("3. remove node from first");
			System.out.println("4. remove node from last");
			System.out.println("5. view all data from linked list");
			
			System.out.println("\nEnter your choice");
			int choice= sc.nextInt();
			System.out.println("====================================================");
			
			switch(choice)
			{
				case 1: //add Node at first
					System.out.println("Enter data at first node");
					int data= sc.nextInt();
					list.addFirst(data);
					break;
				
				case 2: //add Node at last
					System.out.println("Enter data at last node");
					data= sc.nextInt();
					list.addLast(data);

					break;
					
				case 3: //remove node from first
					if(!list.isEmpty()) {
						System.out.println("Remove: "+list.removeFirst());
					}
					else {
						System.out.println("List is Empty");
					}
					break;
					
				case 4: //remove node from last
					if(!list.isEmpty()) {
						System.out.println("Remove: "+list.removeLast());
					}
					break;
					
				case 5: //view all data from linked list
					if(list.isEmpty()) {
						System.out.println("List is Empty");
					}
					else {
						for(Object obj: list) {
							System.out.println(obj);
						}
					}
					break;
					
				case 6:
					System.exit(0);
					break;
					
				default:
					System.out.println("Wrong Choice");
			}
		}while(true);
	}
}
