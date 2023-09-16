class B1static{
	static int i = 4;
	B1static()
	{
		i++;
	}
	void display()
	{
		System.out.println(""i=""+i);
	}
}
public class B1{
	public static void main(String[] args){
		B1static bs1 = new B1static();
		B1static bs2 = new B1static();
		bs2.display();
		bs1.display();
	}
}