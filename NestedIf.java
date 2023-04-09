import java.util.Scanner;  
public class NestedIf 
{  
public static void main(String[] args)
{
int number;
Scanner s=new Scanner(System.in);
System.out.println("Enter the number");
number=s.nextInt();
if (number>0)
{
System.out.println("number is positive");
if (number>20)
{
System.out.println("number is greater than 20");
}
else
{
System.out.println("number is less than 20");
}
}
else if (number<0)
{
System.out.println("number is negative");
}
else
{
System.out.println("number is zero");
}
}
}