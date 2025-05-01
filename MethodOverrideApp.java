/*Write Program to perform method overriding you have to create class 
name as ArrParent with method
void setValue(int arr[]): this method can accept array as parameter
void arrangeSeq(): this method can display array as per user input sequence You have to 
create two child class name as ArrangeAscendingOrder and you have to inherit ArrParent 
class in it and override arrangeSeq() method in ArrangeAscendingOrder and sort array and 
display in ascending order and you have to create one more class name ReverseArray and 
override arrangeSeq() method from ArrParent and reverse array and display it.
*/

import java.util.*;
class ArrParent {
    protected int[] arr;

    void setValue(int arr[]) 
	{
        this.arr= arr;
    }

    void arrangeSeq() 
	{
        System.out.println("ArrParent arrangeSeq method");
    }
}

class AscendingOrder extends ArrParent 
{
	void arrangeSeq() 
	{
        int sortedArr[] = arr.clone();
        for(int i=0;i<sortedArr.length;i++)
		{
			for(int j=i+1;j<sortedArr.length;j++)
			{
				if(sortedArr[i]>sortedArr[j])
				{
					int temp= sortedArr[i];
					sortedArr[i]= sortedArr[j];
					sortedArr[j]= temp;
				}
			}
		}
        System.out.print("\nArray in Ascending Order: ");
		for(int i=0;i<sortedArr.length;i++)
		{
			System.out.print(sortedArr[i]+" ");
		}
    }
}
class ReverseArray extends ArrParent {
    void arrangeSeq() 
	{
        int reversedArr[] = arr.clone();
        for (int i= 0,j=reversedArr.length-1;i< reversedArr.length / 2;i++,j--) 
		{
			int temp= reversedArr[i];
			reversedArr[i]= reversedArr[j];
			reversedArr[j]= temp;
        }
        System.out.print("\nArray in Reverse Order: ");
		for(int i=0;i<reversedArr.length;i++)
		{
			System.out.print(reversedArr[i]+" ");
		}
    }
}
public class MethodOverrideApp {
    public static void main(String[] args) 
	{
        Scanner sc = new Scanner(System.in);
		System.out.print("Enter size of array: ");
        int size = sc.nextInt();
        int arr[] = new int[size];

        System.out.println("Enter " + size + " elements:");
        for (int i= 0; i<arr.length; i++) 
		{
            arr[i] = sc.nextInt();
        }

        AscendingOrder a1 = new AscendingOrder();
        a1.setValue(arr);
        a1.arrangeSeq();

        ReverseArray r1 = new ReverseArray();
        r1.setValue(arr);
        r1.arrangeSeq();
    }
}
