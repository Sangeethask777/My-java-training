import java.util.*;
public class InstanceMethodGrade
{

float num1,num2,num3;
String studentname;
public InstanceMethodGrade(String name,float n1,float n2, float n3)
{
num1=n1;
num2=n2;
num3=n3;
studentname=name;
}
public float total()
{

float total;
total=num1+num2+num3;
return total;
}

public void display(float mark)
{

if(mark>=140 && mark<=160)
{
System.out.println("Your mark is "+mark+" and the grade is C");
}
else if(mark>=160 && mark<=180)
{
System.out.println("Your mark is "+mark+" and the grade is B");
}
else if(mark>=180 && mark<=200)
{
System.out.println("Your mark is "+mark+"and the grade is A");
}
else if(mark<140)
{
System.out.println("You are failed");
}
else
{
System.out.println("Invalid");	
}
}
public static void main(String[] args)
{
	
InstanceMethodGrade obj1=new InstanceMethodGrade("Anu",90.5f,58.7f,49.4f);
InstanceMethodGrade obj2=new InstanceMethodGrade("Minu",76.9f,48.5f,62.3f);


System.out.println("Student 1");
System.out.println("Student name: "+obj1.studentname);
float s1;
s1=obj1.total();
System.out.println("Total marks:"+s1);
obj1.display(s1);


System.out.println("Student 2");
System.out.println("Student name: "+obj2.studentname);
float s2;
s2=obj2.total();


System.out.println("Total marks: "+s2);
obj2.display(s2);






}
}



