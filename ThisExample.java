public class ThisExample
{
public ThisExample(int n1)
{

n1+=100;
System.out.println("number:"+n1);
}
public ThisExample()
{
this(100);	
System.out.println("No argument constructor");	
}
public static void main(String[] args)
{
ThisExample obj1=new ThisExample();
}
}