import java.util.*;
public class WhileLoop
	{
	public static void main(String[] arg)
	  {
		  int num1,i;
		  i=0;
		  Scanner s=new Scanner(System.in);
		  
		  System.out.print(" ENTER THE FINAL NUMBER : ");
		  num1=s.nextInt();
		  System.out.print(" THE NUMBES : ");
		  
		  while(i<num1)
		  {
			   System.out.print(i+"  ");
			   i++;
		  }
	  }
	}