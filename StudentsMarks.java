import java.util.Scanner;  
public class StudentsMarks 
{  
public static void main(String args[])  
{  
int num1;  
System.out.println("Enter your marks: ");  
Scanner s = new Scanner(System.in); 
num1=s.nextInt();
if(num1>=40 && num1<=100)
{
System.out.println("You are passed");
if(num1<=60)
{
System.out.println(" Your Grade is D ");
}
else if(num1<=70)
{
System.out.println("Your Grade is C");
}
else if(num1<=80)
{
System.out.println("Your Grade is B");
}
else
{
System.out.println("Your Grade is A");
}
}
else if(num1<40)
{
System.out.println("Failed");
}
else
{
System.out.println(" Invalid ");
}
}
}

