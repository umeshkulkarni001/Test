package java_111;
import java.util.*;

public class ArrayEqual {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int arr[]=new int[10];
int arr2[]=new int[10];
int temp;
Scanner sc=new Scanner(System.in);
int i,j;
int c=0;
System.out.println("enter elements in first array");
for(i=0;i<5;i++)
{
	arr[i]=sc.nextInt();
}
System.out.println("enter elements in Second array");
for(i=0;i<5;i++)
{
	arr2[i]=sc.nextInt();
}
for(i=0;i<5;i++)
{
	for(j=0;j<5;j++)
	{
		if(arr[i]<arr[j])
		{
			temp=arr[i];
			arr[i]=arr[j];
			arr[j]=temp;
		}
	}
}
for(i=0;i<5;i++)
{
	for(j=0;j<5;j++)
	{
		if(arr2[i]<arr2[j])
		{
			temp=arr2[i];
			arr2[i]=arr2[j];
			arr2[j]=temp;
		}
	}
}
for(i=0;i<5;i++)
{
	System.out.print(arr[i]);
}
System.out.println();
for(i=0;i<5;i++)
{
	System.out.print(arr2[i]);
}
for(i=0;i<5;i++)
{
		if(arr[i]==arr2[i])
		{
			c++;
		}

}
if(c==5)
{
	System.out.println("Yes");
}
else
	System.out.println("No");
	}

}
