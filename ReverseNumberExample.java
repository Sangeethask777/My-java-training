
import java.util.*;
public class ReverseNumberExample
{
	
public static void main(String[] args)
	{
int n,r;
System.out.print("enter the number:");
Scanner sc=new Scanner(System.in);
n=sc.nextInt();

while(n>0)
{
r=n%10;
System.out.print(r);
n=n/10;
}
}
}

