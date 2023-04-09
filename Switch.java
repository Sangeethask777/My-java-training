import java.util.Scanner;  
public class Switch 
{  
public static void main(String[] args)
{
int number;
Scanner s=new Scanner(System.in);
System.out.println("enter number between 1 and 5");
number=s.nextInt();
switch(number)
{
case 1:
number++;
System.out.println("number : "+number);
break;
case 2:
number--;
System.out.println("number : "+number);
break;
case 3:
number+=20;
System.out.println("number : "+number);
break;
case 4:
number==20;
System.out.println("number : "+number);
break;
case 5:
number+=100;
System.out.println("number : "+number);
break;
default :
System.out.println("Enter a valid number");
}
}
}


