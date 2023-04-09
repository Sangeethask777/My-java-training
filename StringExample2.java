public class StringExample2
{
public static void main(String[] args)
{
String s1=new String("Hello");
String s2=new String("hello");


if(s1.equalsIgnoreCase(s2))
{
System.out.println("equal");
}
else
System.out.println("not equal");


}
}