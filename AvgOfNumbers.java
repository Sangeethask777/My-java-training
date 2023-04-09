public class AvgOfNumbers
{
public static void average(int n1, int n2, int n3)
{
int sum;
int avg;
sum=n1+n2+n3;
avg=sum/3;
System.out.println("Average of three integer number is: "+avg);
}
public static void average(float n1, float n2, float n3)
{
float sum;
float avg;
sum=n1+n2+n3;
avg=sum/3;
System.out.println("Average of three float number is: "+avg);
}
public static void main(String[] args)
{
AvgOfNumbers.average(12.5f,10.6f,10.7f);

AvgOfNumbers.average(10,20,30);
}
}