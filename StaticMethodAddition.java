public class StaticMethodAddition
{
static float sum;
static int num1;
static int num2;
static float num3;
public static void addition(int n1,int n2,float n3)
{
num1=n1;
num2=n2;
num3=n3;
sum=n1+n2+n3;
}
public static void display()
{
System.out.println("number1 : "+num1);
System.out.println("number2 : "+num2);
System.out.println("number3 : "+num3);
System.out.println("sum : "+sum);
}
public static void main(String[] args)
{
StaticMethodAddition.addition(10,20,30.5f);
StaticMethodAddition.display();
}
}

