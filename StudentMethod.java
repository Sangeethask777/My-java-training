public class StudentMethod
{
String name;
int rollno;
public void input(String name, int rollno)
{
this.name=name;
this.rollno=rollno;
}
public void output()
{
System.out.println("student name:"+name);
System.out.println("roll number:"+rollno);
}
public static void main(String[] args)
{
StudentMethod obj1=new StudentMethod();
obj1.input("Anu",30);
obj1.output();
}
}
