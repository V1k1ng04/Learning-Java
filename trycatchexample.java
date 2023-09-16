public class trycatchexample
{
public static void main(String args[])
{
	try{
	int a[] = new int[5];
	a[10] = 100;
	}
	catch(ArithmeticException e)
	{
	System.out.println("Arithmetic exception occurs");
	}
	catch(ArrayIndexOutOfBoundsException e)
	{
	System.out.println("ArrayIndexOutOfBounds Exception occurs");
	}
	catch(Exception e)
	{
	System.out.println("Parent Exception occurs");
	}
	finally{
	System.out.println("I am become finally, Executed always.");
	}
}

}