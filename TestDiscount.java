import java.util.*;
public class TestDiscount
{
static int num1,num2,num3;
static int sum;
public static void itemname()
{
String item1,item2,item3;

}
public static void totalamount()
{
sum=num1+num2+num3;
}

public static int discount()
{
if(sum>5000)
{
sum=sum*20/100;
System.out.println("the amount after discount: "+sum);
}
else
{
System.out.println("No discount");
}
return sum;
}

public static void main(String[] args)
{
String pd1,pd2,pd3;



Scanner sc=new Scanner(System.in);

System.out.println("enter the first product");
pd1=sc.nextLine();

System.out.println("enter the second product");
pd2=sc.nextLine();

System.out.println("enter the third product");
pd3=sc.nextLine();

TestDiscount.itemname();

System.out.println("amount of first product");
num1=sc.nextInt();
System.out.println("amount of second product");
num2=sc.nextInt();
System.out.println("amount of third product");
num3=sc.nextInt();
TestDiscount.totalamount();

System.out.println("the amount of "+pd1+" is "+num1);
System.out.println("the amount of "+pd2+" is "+num2);
System.out.println("the amount of "+pd3+" is "+num3);

System.out.println("total amount is: "+sum);

TestDiscount.discount();
}
}