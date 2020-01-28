import java.io.*;
import java.util.*;
public class p-2.3
{
	public static void main(String[] args) 
	{
		Scanner s=new Scanner(System.in);
		int n=s.nextInt();
		int on=n;
		int r;
		int rn=0;
		while(n!=0)
		{
		    r=n%10;
		    rn=rn*10+r;
		    n=n/10;
		}
		if(rn==on)
		{
		    System.out.println(on+" is a palindrome");
		}
		else
		{
		    System.out.println(on+" is not a palindrome");
		}
	}
}
