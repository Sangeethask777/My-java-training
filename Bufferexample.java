public class Bufferexample
{
public static void main(String[] args)
{
StringBuffer str1=new StringBuffer("hello");
System.out.println("length: "+str1.length());
str1.append("world");
System.out.println("append: "+str1);

str1.insert(5,"-");
System.out.println("insert: "+str1);

str1.reverse();
System.out.println("reverse: "+str1);

String s1;
s1=str1.toString();
System.out.println("String: "+str1);

}
}