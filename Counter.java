class Counter{
static int ctr = 0;

Counter(){
ctr++;
}

public static void showCount()
{
System.out.println("No. of objects created = "+ctr);
}

public static void main(String args[])
{
Counter c1 = new Counter();
Counter c2 = new Counter();
Counter c3 = new Counter();

showCount();

}
}
