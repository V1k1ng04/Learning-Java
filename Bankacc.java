import java.util.*;

class Bankacc{

String name;
int accno;
String acctype;
int bal;
static double roi;

Scanner sc = new Scanner(System.in);

//default
Bankacc()
{
}

//parametrized
Bankacc(String n, int an, String at, int b)
{
this.name = n;
this.accno = an;
this.acctype = at;
this.bal = b;
}

void deposit()
{
System.out.println("Enter amount you want to deposit: ");
bal += sc.nextInt();
System.out.println("New balance is: "+bal);
}

void withdraw()
{
int minbal = 10000;
if(bal >= minbal)
{
System.out.println("Enter amount to withdraw: ");
bal -= sc.nextInt();
System.out.println("New balance is: "+bal);
}
else
{
System.out.println("You are below minimum balance. You cannot withdraw funds.");
}
}

void display()
{
System.out.println("Name: "+name);
System.out.println("Account number: "+accno);
System.out.println("Account Type: "+acctype);
System.out.println("Balance: "+bal);
}

static void roi()
{
roi = 5.7;
System.out.println("Rate of interest for this account is: "+roi+"%");
}

public static void main(String args[]){

Bankacc b1 = new Bankacc();
System.out.println("Printing default values for constructor...");
System.out.println();
b1.display();

Bankacc b2 = new Bankacc("Mukesh", 120938, "Savings", 60000);
System.out.println("Printing default values for parametrized constructor...");
b2.display();
b2.deposit();
b2.withdraw();
roi();
}
}


