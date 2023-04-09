import java.util.Scanner;  
public class Positive 
{  
public static void main(String[] args)   
{  
int num1;  
Scanner sc = new Scanner(System.in);  
System.out.print("Enter a number: ");    
num1 = sc.nextInt();  
if(num1>0)  
{  
System.out.println("The number is positive.");  
}  
else if(num1<0)  
{  
System.out.println("The number is negative.");  
}  
}  
}  