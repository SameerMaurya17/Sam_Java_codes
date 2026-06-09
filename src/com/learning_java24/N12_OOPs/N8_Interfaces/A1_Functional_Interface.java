package com.learning_java24.N12_OOPs.N8_Interfaces;

// Functional Interface are those Interface which has only one single function (we are use lambda expression with functional interface)
@FunctionalInterface // This is the annotation for the FunctionalInterface
interface A
{
    void show();
//	void run();
}
//class B implements A
//{
//	public void show()
//	{
//		System.out.println("in Show");
//	}
//}


public class A1_Functional_Interface {
    public static void main(String[] args) {

// Functional Interface are those Interface which has only one single function (we are use lambda expression with functional interface)
        A obj=new A()
        {
            public void show()
            {
                System.out.println("in Show");
            }
        };
        //   	A obj=new A();
        //   	A obj=new B();
        obj.show();
    }
}