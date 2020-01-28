import java.io.*;
import java.util.*;
public class p-2.2
{
	public static void main(String[] args) 
	{
		Scanner s=new Scanner(System.in);
		int n=s.nextInt();
		int flag=0;
		if(n==0)
		{
		    System.out.println("0 is neither prime nor composite");
		}
		else if(n==1)
		{
		    System.out.println("1 is neither prime nor composite");
		}
		else 
		{
		for(int i=2;i<n/2;i++)
		{
		    if(n%i==0)
		    {
		        flag=1;
		        break;
		    }
		}
		if(flag==1)
		{
		    System.out.println(n+" is not a prime number");
		}
		else
		{
		    System.out.println(n+" is  prime number");
		}
		}
	}
}
