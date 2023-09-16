import java.util.Scanner;

class largest{

public static void main(String args[]){

Scanner sc = new Scanner(System.in);
int i;
int n1,n2,n3;
int max;

System.out.println("Enter 3 integers: ");
n1 = sc.nextInt();
n2 = sc.nextInt();
n3 = sc.nextInt();

if(n1>n2 && n2<n3){
	max = n1;}
else if(n2>n3){
	max = n2;}
else{
	max = n3;}

System.out.println("The largest of 3 numbers is: "+max);
}
}
