import java.util.*;

/*public class MaxConsucutiveLength
{
	public static void main(String args[]){
		
		int arr[]= {1,1,0,1,1,1,0,1};
		int maxCount= 0;
		int currentCount= 0;
		
		for(int i=0;i<arr.length;i++){
			if(arr[i]==1)
			{
				currentCount++;
				if(currentCount> maxCount)
				{
					maxCount= currentCount;
				}
			}
			else{
				currentCount= 0;
			}
				
		}
			
			System.out.println(maxCount);
		
	}
}
*/

public class MaxConsucutiveLength
{
	public static void main(String args[]){
		Scanner sc= new Scanner(System.in);
		try{
		System.out.println("Enter array size");
		int size= sc.nextInt();
		
		int arr[]= new int[size];
		for(int i=0;i<arr.length;i++){
			arr[i]= sc.nextInt();
		}
		int maxCount= 0;
		int currentCount= 0;
		
		for(int i=0;i<arr.length;i++){
			if(arr[i]==1)
			{
				currentCount++;
				
				if(currentCount> maxCount)
				{
					maxCount= currentCount;
				}
			}
			else{
				currentCount= 0;
			}
		}
		
		System.out.println(maxCount);
		}
		catch(NoSuchElementException ex){
			System.out.println(ex+": Give the any input");
		}
	}
}
