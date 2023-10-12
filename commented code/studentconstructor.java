import java.util.*;

class studentconstructor{
String name;
int rollno;
double GPA;

Scanner sc = new Scanner(System.in);

studentconstructor(){
}

studentconstructor(String name, int rollno, double GPA)
{
this.name = name;
this.rollno = rollno;
this. GPA = GPA;
}

studentconstructor(studentconstructor stu)
{}


void display()
{
System.out.println("Name: "+name+" Roll no: "+rollno+" GPA: "+GPA);
}

public static void main(String[] args){

studentconstructor s1 = new studentconstructor();
studentconstructor s2 = new studentconstructor("Satvik", 20, 8.0);
studentconstructor s3 = new studentconstructor(s1);


s1.display();
s3.display();
s2.display();

}
}
