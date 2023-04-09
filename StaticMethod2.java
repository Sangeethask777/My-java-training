import java.util.*;
public class StaticMethod2
{
static int age;
static String name;
public static void input()
{
Scanner s=new Scanner(System.in);
System.out.print(" Enter your name: ");
name=s.nextLine();
System.out.print(" Enter your age : ");
age=s.nextInt();
}
public static void display(String name,int num1)
{
System.out.println("Your name : "+name);
System.out.println("Your age : "+num1);
}
public static void main(String[] args)
{
StaticMethod2.input(); 
StaticMethod2.display(name,age); 
}
}
