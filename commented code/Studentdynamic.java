import java.util.*;

public class Studentdynamic {
    
    private int rollno;
    private String name;
    private int[] marks;  //init


Studentdynamic(String name, int rollno, int[] marks){

    this.name = name;
    this.rollno = rollno;
    this.marks = marks;   //parametrized constructor
}

void display()
{
    
    System.out.println("\nName: "+name);
    System.out.println("\nRoll Number: "+rollno);

    System.out.println("\nMarks: ");
    for(int mark: marks)                   //for each loop
    {
        System.out.print(mark + " ");
        System.out.println();
    }
    System.out.println();
}

public static void main(String[] args)
{
    Scanner sc = new Scanner(System.in);

    System.out.println("\nEnter no. of student records: ");
    int n = sc.nextInt(); 
    sc.nextLine();  //clear inp buffer

    Studentdynamic[] stulist = new Studentdynamic[n];            //array of objects

    for (int i = 0; i < n; i++) {
        System.out.println("\nEnter name of student no. " + (i + 1) + ":");
        String name = sc.nextLine();
        
        System.out.println("\nEnter roll number of student no. " + (i + 1) + ":");
        int rollno = sc.nextInt();
        sc.nextLine();                         
        
        int marks[] = new int[3];              //declare marks array and its size
        System.out.println("\nEnter marks for 3 subjects:");
        for(int j = 0; j<3; j++){

            System.out.println("\nEnter marks in subject "+(j+1)+":");
            marks[j] = sc.nextInt();         //update array
        }
        sc.nextLine();
    
        stulist[i] = new Studentdynamic(name, rollno, marks);
    }
    
    System.out.println("\nStudent records: ");
    for(Studentdynamic stu: stulist)
    {
        stu.display();
    }
}
}