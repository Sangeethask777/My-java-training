  import java.util.*;
  public class PrimeorNot 
  {
  public static void main(String[] args) 
  {
  int num;
  int flag=0;   
  Scanner s=new Scanner(System.in);
  System.out.print(" ENTER THE NUMBER : ");
  num=s.nextInt();
  if (num==0||num==1)
  {
  flag=1;  
  }
  else
  {
  for (int i = 2; i <= num / 2; ++i) 
 {					
 if (num % i == 0) 
{
flag=1; 
break;
}
}
}
 if (flag==0)
{
System.out.println(num + " is a prime number.");
 }
 else
{
System.out.println(num + " is not a prime number.");
}
}
}
