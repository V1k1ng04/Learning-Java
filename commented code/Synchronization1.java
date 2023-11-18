package Java;
public class Synchronization1 implements Runnable
{
    int tickets = 3;
    static int i = 1, j = 2, k = 3;
  synchronized void bookticket (String name, int wantedtickets)
    {
           

        if (wantedtickets <= tickets)
        {
            System.out.println (wantedtickets + " ticket booked to thread " + name);
            tickets = tickets - wantedtickets;
        }
        else
        {

              String name1 = Thread.currentThread ().getName ();
            System.out.println ("No tickets to book"+ " for thread "+name1);
 }       
    }
    public void run ()
    {
        String name = Thread.currentThread ().getName ();
        if (name.equals ("t1"))
        {
            bookticket (name, i);
        }
        else if (name.equals ("t2"))
        {
            bookticket (name, j);
        }
        else
        {
            bookticket (name, k);
        }
    }

    public static void main (String[]args)
    {
        Synchronization1 s = new Synchronization1();
        Thread t1 = new Thread (s);
        Thread t2 = new Thread (s);
        Thread t3 = new Thread (s);
        t1.setName ("t1");
        t2.setName ("t2");
        t3.setName ("t3");
        t1.start ();
        t2.start ();
        t3.start ();
    }
}