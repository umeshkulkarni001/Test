package junit;

import static org.junit.Assert.assertEquals;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

import org.junit.Test;

public class Library {
	Scanner sc1=new Scanner(System.in);
	HashMap map;ArrayList arr;
	void Lib(HashMap map,ArrayList arr)
	{
		this.map=map;
		this.arr=arr;
	}
	
	boolean Adduser(HashMap map)
	{
		boolean b=false;
	
		System.out.println("Enter name of user");
		String name=sc1.nextLine();
		System.out.println("Enter name of password");
		String pass=sc1.nextLine();
		map.put(pass,name);
    	System.out.println("Press '1' to add user again");
    	b=true;
    	assertEquals(true,b);
		int c=sc1.nextInt();
		sc1.nextLine();
	
		if(1==c)
		{
			Adduser(map);
		}
		return b;

		
	}
	
	boolean AddBook(ArrayList arr)
	{
		boolean b=true;
		System.out.println("Enter name of Book");
		String name=sc1.nextLine();
		arr.add(name);
	    System.out.println("Press '1' to add user again");
	    	b=true;
	    	assertEquals(true,b);
			int c=sc1.nextInt();
			sc1.nextLine();
		
			if(1==c)
			{
				AddBook(arr);
			}
			return b;
	}
	
	boolean validate(HashMap map)
	{
		boolean b=false;
		System.out.println("Enter user");
		String s=sc1.nextLine();
		System.out.println("Enter password");
		String s1=sc1.nextLine();
		b=true;
		if(map.get(s1)==s)
		{
			System.out.println("Succesfully logged in");
		}
		else
			System.out.println("User not found");
		assertEquals(true,b);
		return b;
		
	}
	@Test
	public void TestLogic()
	{
		map=new HashMap();
		arr=new ArrayList();
		boolean c=Adduser(map);
		assertEquals(true,c);
		boolean d=AddBook(arr);
		assertEquals(true,d);
		c=validate(map);
		assertEquals(true,c);
		
	}
	

	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
HashMap map=new HashMap();
Scanner sc=new Scanner(System.in);
ArrayList arr=new ArrayList();
Library lib=new Library();
System.out.println("Enter your choice");
System.out.println("1 for Add User");
System.out.println("2 for Add Books");
System.out.println("3 for log in");
int a=sc.nextInt();
switch(a)
{
case 1:
			lib.Adduser(map);

			break;
case 2:
			lib.AddBook(arr);

			break;
case 3:
			lib.validate(map);
			break;








}

	}

}
