import java.util.*;
public class StringPalindrome
{
public static void main(String[] args)
{
String name,reverseStr="";
int length;
String s1=new String();

Scanner sc=new Scanner(System.in);
System.out.println("Enter the string:");
s1=sc.nextLine();
	 
name=s1;
length=s1.length();
    
for (int i=length-1; i>=0; i--) 
{
reverseStr = reverseStr + s1.charAt(i);
	  
}
if (name.equalsIgnoreCase(reverseStr)) 
{
 System.out.println("It is a Palindrome String.");
 }
 else 
{
System.out.println("It is not a Palindrome String.");
}
}
}