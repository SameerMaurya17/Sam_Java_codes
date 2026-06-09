package com.learning_java24.N13_Threads;

class Counter
{
    int count;
    //	public void increment()
    public synchronized void increment() // Synchronized makes this function to be only called by one method at a time
    {
        count++;
    }
}
public class Muatability_SynchroniizedThreads {

    public static void main(String[] args) throws InterruptedException {

        Counter c=new Counter();

        Runnable obj1=()->
        {
//    		for(int i=1;i<=1000;i++)
            for(int i=1;i<=10000;i++)
            {
                c.increment();
            }
        };

        Runnable obj2=()->
        {
//    		for(int i=1;i<=1000;i++)
            for(int i=1;i<=10000;i++)
            {
                c.increment();
            }
        };

        Thread t1=new Thread(obj1);
        Thread t2=new Thread(obj2);

        t1.start();
        t2.start();

        t1.join(); // by calling the join function it makes the Main thread to wait for that thread to complete its execution
        t2.join(); // Waits for this thread to terminate.

        System.out.println(c.count);

    }

}
