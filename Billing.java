/* WAP to create class name as Product as POJO class with 
field id,name and qty and price and you have to create Shop as class with following methods 
void setProducts(Customer customer,Product …p): this method can accept the n number of products 
void findBill(): this function can find the bill of a customer using the following format. */

import java.util.*;
class Product
{
	private int id,qty,price;
	private String name;
	
	public void setId(int id)
	{
		this.id=id;
	}
	public int getId()
	{
		return id;
	}
	public void setQty(int qty)
	{
		this.qty=qty;
	}
	public int getQty()
	{
		return qty;
	}
	public void setPrice(int price)
	{
		this.price=price;
	}
	public int getPrice()
	{
		return price;
	}
	public void setName(String name)
	{
		this.name=name;
	}
	public String getName()
	{
		return name;
	}
}
class Shop
{
	Product p[];
	public void setProducts(Product ...p)
	{
		this.p=p;
		System.out.println("\nProduct details");
		System.out.println("Id"+" "+"Name"+" "+"Qty"+" "+"price");
		for(Product p1: p)
		{
			System.out.println(p1.getId()+"   "+p1.getName()+"   "+p1.getQty()+"   "+p1.getPrice());
		}
	}
	
	public void findbill()
	{
		int bill1=0;
		System.out.println("\nBill");
		System.out.println("Id"+" "+"Name"+" "+"qty"+"  "+"Price"+"  "+"bill");
		for(Product p1: p)
		{
			System.out.println(p1.getId()+"   "+p1.getName()+"    "+p1.getQty()+"   "+p1.getPrice()+"  "+p1.getPrice()*p1.getQty());
			bill1+=p1.getPrice()*p1.getQty();
		}
		System.out.println("Bill: "+bill1);
	}
}

public class Billing
{
	public static void main(String args[]){
		Scanner sc= new Scanner(System.in);
		int size= sc.nextInt();
		Product p1[]= new Product[size];
		Shop s1= new Shop();
		
		for(int i=0;i<p1.length;i++)
		{
			System.out.println("Enter product id,name,quantity,price");
			p1[i]= new Product();
			int id= sc.nextInt();
			sc.nextLine();
			String name= sc.nextLine();
			int qty= sc.nextInt();
			int price= sc.nextInt();
			
			p1[i].setId(id);
			p1[i].setName(name);
			p1[i].setQty(qty);
			p1[i].setPrice(price);
		}
		s1.setProducts(p1);
		s1.findbill();
	}
}

