import java.util.*;
public class PalindromeorNot
{
	static int reverse;
	static int temp;
public static void input(int n1)
{

 reverse=0;
int remainder;
temp=n1;
while(n1!=0)
{
remainder=n1%10;
reverse=reverse*10+remainder;
n1=n1/10;
}
}

public static void output()
{
if (temp==reverse)

System.out.println("It is a Palindrome number.");    
else    
System.out.println("Not a palindrome");  
}
public static void main(String[] args)
{
System.out.println("enter the number");
Scanner sc=new Scanner(System.in);
int a=sc.nextInt();
PalindromeorNot.input(a);
PalindromeorNot.output();
}
}


