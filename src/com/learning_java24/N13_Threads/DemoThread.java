package com.learning_java24.N13_Threads;

class A extends Thread{
    public void run(){
        for (int i = 0; i < 100; i++) {
            System.out.println("Morning Luv ❤️");

            try {
                Thread.sleep(10); // This will put this to sleep for the given milli seconds
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}

class B extends Thread{
    public void run(){
        for (int i = 0; i < 100; i++) {
            System.out.println("Hello, Luv 💜");
        }
    }
}

public class DemoThread{

    public static void main(String[] args) {

//        System.out.println(Thread.currentThread().getName()); // Gives the name of current thread

        A obj1 = new A();
        B obj2 = new B();



        obj1.start();
        try {
            Thread.sleep(5); // This will put this to sleep for the given milli seconds
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        obj2.start();

//        System.out.println(obj1.getPriority()); // Gets the Priority of the thread
//        obj1.setPriority(1); // Priority ranges from 1 to 10 1 being the least and 10 being the highest
//        obj1.setPriority(Thread.MAX_PRIORITY); // Thread class also have some constants
        // Point to note is that this only suggests the scheduler not actual tell it to run that thread

        // State Changes when the thread starts executing
//        System.out.println(obj1.getState());
//        System.out.println(obj2.getState());

//        System.out.println(obj1.threadId());
//        System.out.println(obj2.threadId());

//        obj1.run();
//        obj2.run();

//        System.out.println(obj1.getName());
//        System.out.println(obj2.getName());


    }

}