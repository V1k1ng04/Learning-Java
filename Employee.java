import java.util.*;
public class Employee{

String name;
int id;
int salary;

//parametrized constructor
Employee(int i, String n, int i2)
{
salary = i;
name = n;
id = i2;
}

//default constructor
Employee()
{
}

//copy constructor
public Employee(Employee emp)
{
this.name = name;
this.id = id;
this.salary = salary;
}

void read()
{
Scanner sc = new Scanner(System.in);
System.out.println("Enter name: ");
this.name = sc.nextLine();
System.out.println("Enter id: ");
this.id = sc.nextInt();
System.out.println("Enter salary: ");
this.salary = sc.nextInt();
}

void display()
{
System.out.println("Name: "+this.name);
System.out.println("ID: "+this.id);
System.out.println("Age: "+this.salary);
System.out.println();
}

public static void main(String args[]){
Employee emp = new Employee();
Employee emp2 = new Employee(18000, "Dinesh", 20);
Employee emp3 = new Employee(emp2);

emp.read();
emp.display();
emp3.read();
emp3.display();
emp2.display();

}
}