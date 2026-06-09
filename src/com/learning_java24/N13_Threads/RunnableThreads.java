package com.learning_java24.N13_Threads;

// To make a Thread we need to extend the Thread class or use the implement the Runnable interface
// In java, we can extend only one class and if we also want that class to be a thread then we can use the Runnable Interface
class A1 implements Runnable{
    public void run(){
        for (int i = 0; i < 5; i++) {
            System.out.println("Morning Luv ❤️");
        }
    }
}

class B2 implements Runnable{
    public void run(){
        for (int i = 0; i < 5; i++) {
            System.out.println("Hello, Luv 💜");
        }
    }
}
public class RunnableThreads {

    public static void main(String[] args) {

//        A1 obj1 = new A1();
//        B2 obj2 = new B2();

//        Runnable obj1 = new A1();
//        Runnable obj2 = new B2();
//        // Using references
//
//        Thread t1 = new Thread(obj1);
//        Thread t2 = new Thread(obj2);
//
//        t1.start();
//        t2.start();

        // Or we can just use lambda expressions to just directly make objects of Runnable interfaces without needing any class

        Runnable obj1 = () -> {
                for (int i = 0; i < 5; i++) {
                    System.out.println("Hello, Luv 💜");
                }
        };

        Runnable obj2 = () -> {
            for (int i = 0; i < 5; i++) {
                System.out.println("Morning Luv ❤️");
            }
        };

        Thread t1 = new Thread(obj1 , "Can also Name them"); // We can also name our threads
        Thread t2 = new Thread(obj2);

        t1.start();
        t2.start();

    }

}
