public class Swapping2
{
	public static void main(String[] arg)
	{
	int a,b;
	a=25;
	b=30;
	System.out.println("BEFORE SWAPPING NUMBER 1 :"+a);
	System.out.println("BEFORE SWAPPING NUMBER 2 :"+b);
	a+=b;       // a=a+b;
	b=a-b;      // b=a-b;
	a-=b;       // a=a-b;
	System.out.println("AFTER SWAPPING NUMBER 1 :"+a);
	System.out.println("AFTER SWAPPING NUMBER 2 :"+b);
	}
}





