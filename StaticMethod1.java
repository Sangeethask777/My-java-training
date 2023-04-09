public class StaticMethod1
{
public static void addition(int n1,int n2,float n3)
{
float sum;
sum=n1+n2+n3;
System.out.println("sum: "+sum);
}
public static void main(String[] args)
{
StaticMethod1.addition(20,10,30.25f);
System.out.println("Example of static method");
}
}