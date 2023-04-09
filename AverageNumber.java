import java.lang.Integer;
class AverageNumber
{
public static void main(String args[])
{
int num1;
int num2;
int num3;
int sum;
num1=10;
num2=20;
num3=30;
double avg;
num1= Integer.parseInt(args[0]);
num2= Integer.parseInt(args[1]);
num3= Integer.parseInt(args[2]);
sum=num1+num2+num3;
System.out.println("The sum of three number is "+sum);
avg=(num1+num2+num3)/3;
System.out.println("The average of three number is "+avg);
}
}