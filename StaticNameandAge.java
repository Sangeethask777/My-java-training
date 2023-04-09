import java.util.*;
public class StaticNameandAge
{
static int age;
static String name;
public static void input()
{
Scanner sc=new Scanner(System.in);
System.out.println("Enter your name:");
name=sc.nextLine();
System.out.println("Enter your age:");
age=sc.nextInt();


}
public static void display(String name,int n1)
{
System.out.println("your name is: "+name);
System.out.println("your age is: "+n1);

}
public static void main(String[] args)
{
StaticNameandAge.input();
StaticNameandAge.display(name,age);
}
}