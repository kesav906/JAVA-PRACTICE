import java.io.*;
import java.util.*;
public class p-2.4
{
	public static void main(String[] args) 
	{
		Scanner s=new Scanner(System.in);
		int n=s.nextInt();
		int r;
		int sum=0;
		while(n!=0)
		{
		    r=n%10;
		    sum+=r;
		    n=n/10;
		}
		System.out.println(sum);
	}
}
