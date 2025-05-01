/*  Write a java program to create class name as OccurenceApp using contsructor name as :

	OccurenceApp(int [ ])
	{
		//  count even and odd number in array.
	}
	
	OccurenceApp(char [ ])
	{
		//  count vowel and consonent charcter in string.
	} */
	
import java.util.*;
public class OccurenceApp
{
	int arr[];
	int count_1=0, count_2=0;
	OccurenceApp(int arr[])
	{
		for(int i=0;i<arr.length;i++)
		{
			if(arr[i]%2==0)
			{
				count_1++;
			}
			else{
				count_2++;
			}
		}
		System.out.print("Count of Even Number: "+count_1);
		System.out.print("\nCount of Odd Number: "+count_2);
	}
	OccurenceApp(char chArr[])
	{
		int vowel= 0,consonent= 0;
		for(char ch: chArr)
		{
			if(Character.isLetter(ch))
			{
				char lower= Character.toLowerCase(ch);
				if(lower=='a' || lower=='e' || lower=='i' || lower=='o' || lower=='u')
				{
					vowel++;
				}
				else{
					consonent++;
				}
			}
		}
		
		System.out.println("\nVowel Count: "+vowel);
		System.out.println("Consonent count: "+consonent);
	}
	
	public static void main(String args[]){
		Scanner sc= new Scanner(System.in);
		System.out.print("Enter size of array: ");
		int size= sc.nextInt();
		int a[]= new int[size];
		
		System.out.println("Enter element of array");
		for(int i=0;i<a.length;i++)
		{
			a[i]= sc.nextInt();
		}
		
		new OccurenceApp(a);
		
		char ch[]= "Ganesh Jadhav".toCharArray();
		new OccurenceApp(ch);
	}
}

