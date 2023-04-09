public class StudentMarksConstructor
{
String name;
float mark;
int rollno;
public StudentMarksConstructor(String n1,float n2,int n3)
{
name=n1;
mark=n2;
rollno=n3;
}
public static void main(String[] args)
{
StudentMarksConstructor obj1=new StudentMarksConstructor("Anu",50.5f,6);
StudentMarksConstructor obj2=new StudentMarksConstructor("Meenu",70.5f,23);
StudentMarksConstructor obj3=new StudentMarksConstructor("Riya",75.5f,36);

System.out.println("Student 1");
System.out.println("Student name: "+obj1.name);
System.out.println("Marks:"+obj1.mark);
System.out.println("rollno:"+obj1.rollno);

System.out.println("Student 2");
System.out.println("Student name: "+obj2.name);
System.out.println("Marks:"+obj2.mark);
System.out.println("rollno:"+obj2.rollno);

System.out.println("Student 3");
System.out.println("Student name: "+obj3.name);
System.out.println("Marks:"+obj3.mark);
System.out.println("rollno:"+obj3.rollno);
}
}

