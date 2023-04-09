
public class ThisConstructor
{
int reverse=0;
public ThisConstructor(int n)
{
int remainder;
System.out.print("The number is: "+n);

while(n!=0)
{
remainder=n%10;
reverse=reverse*10+remainder;
n=n/10;
}
}

public ThisConstructor()
{
this(456);
System.out.print("  Reversed number is: "+reverse);

}


public static void main(String[] args)
{
ThisConstructor obj1=new ThisConstructor();
}
}
