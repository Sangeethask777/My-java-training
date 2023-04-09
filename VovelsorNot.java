import java.util.*;
public class VowelsorNot 
{
public static void main(String[] arg)
{
 char ch;
Scanner s=new Scanner(System.in);
System.out.println(" Enter the alphabets ");
ch=s.next().charAt(0);
switch(ch)
{
case 'a':
case 'e':
case 'i':
case 'o':
case 'u':
			
System.out.println(ch + " is vowel");
break;
default:
System.out.println(ch + " is not a vowel ");
}
}
}
