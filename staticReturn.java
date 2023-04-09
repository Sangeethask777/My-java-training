public class StaticReturn
{
public static float sum(int a, float b)
{
float sum;
sum=a+b;
return sum;
}
public static void main(String[] args)
{
float result;
result=StaticReturn.sum(2,5f);
System.out.println("sum : "+result);
}
}