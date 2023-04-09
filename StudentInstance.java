public class StudentInstance
{
int rollno;
String name;
public void input(int n1,String n2)
{
rollno=n1;
name=n2;
}
public void display()
{
System.out.println("student name:"+name);
System.out.println("student rollno:"+rollno);
}
public static void main(String[] args)
{
StudentInstance obj=new StudentInstance();
obj.input(56,"Anu");
obj.display();
}
}