import java.util.*;
public class ReverseNumber 
{  
public static void main(String[] args)   
{  
int number,reverse,remainder;  
Scanner s=new Scanner(System.in);
System.out.print(" ENTER THE NUMBER : ");
number=s.nextInt();
reverse=0;
while(number != 0)   
{  
remainder = number % 10;  
reverse = reverse * 10 + remainder;  
number = number/10;  
}  
System.out.println(" The reverse of the given number is: " + reverse);  
}  
}  
