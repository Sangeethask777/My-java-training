
import java.util.Scanner;
public class Scanner2
{
public static void main(String args[])
{
String name;
char ch;
int number1;
float number2;
Scanner s=new Scanner(System.in);
System.out.println("Enter name");
name=s.nextLine();
System.out.println("Enter integer number");
number1=s.nextInt();
System.out.println("Enter float number");
number2=s.nextFloat();
System.out.println("Enter single character");
ch=s.next().charAt(0);
System.out.println("name: "+name);
System.out.println("Character: "+ch);
System.out.println("number: "+number1);
System.out.println("float number: "+number2);
}
}





