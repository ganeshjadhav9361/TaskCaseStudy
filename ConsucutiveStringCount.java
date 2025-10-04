import java.util.*;

/*public class ConsucutiveStringCount
{
	public static void main(String args[]){
		
		String str= "aabcccccaaa";
		int n= str.length();
		
		int i,j;
		for(i=0;i<n; ){
			char current= str.charAt(i);
			int count= 1;
			
			for(j=i+1;j<n;j++){
				if(str.charAt(j)==current)
				{
					count++;
				}
				else{
					break;
				}
			}
			System.out.print(current+""+count);
			i=j;
		}
			
	}
}
*/

public class ConsucutiveStringCount
{
	public static void main(String args[]){
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter any string");
		String str= sc.nextLine();
		
		int n= str.length();
		int i,j;
		
		for(i=0;i<n; ){
			char current= str.charAt(i);
			int count= 1;
			
			for(j=i+1;j<n;j++){
				if(str.charAt(j)==current)
				{
					count++;
				}
				else{
					break;
				}
			}
			
			System.out.print(current+""+count);
			
			i=j;
		}
	}
}