import java.lang.Integer;
public class CommandLineArgument2
{
public static void main(String[] args)
{
int num1;
int num2;
int sum;
num1=Integer.parseInt(args[0]);
num2=Integer.parseInt(args[1]);
sum=num1+num2;
System.out.println("sum: "+sum);
}
}