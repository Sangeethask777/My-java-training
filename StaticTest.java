public class StaticTest
{
public static void input(float n1,int n2,int n3)
{
float sum;
sum=n1+n2+n3;
System.out.println("sum: "+sum);
}



public static void main(String[] args)
{
StaticTest.input(5.8f,6,7);


System.out.println("static test");
}
}