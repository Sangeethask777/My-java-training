public class StringExample
{
public static void main(String[] args)
{
String s1=new String("Hello");
int len;
len=s1.length();
System.out.println("length: "+len);





s1=s1.concat("world");
System.out.println(s1);
System.out.println("length: "+s1.length());
}
}