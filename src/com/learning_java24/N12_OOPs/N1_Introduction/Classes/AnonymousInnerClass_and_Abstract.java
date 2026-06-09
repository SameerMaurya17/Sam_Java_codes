package com.learning_java24.N12_OOPs.N1_Introduction.Classes;

abstract class A
{
    public abstract void show();
    public abstract void config();

}

//class A{
//
//    public void show()
//    {
//        System.out.println("in A show");
//    }
//
//}

// B class is only there to override show method of A. which means B class might only be called once so why we use Anonymous Inner Class

//class B extends A
//{
//	public void show()
//	{
//		System.out.println("in B show");
//	}
//}

public class AnonymousInnerClass_and_Abstract{

    public static void main(String[] args) {
// B class is only there to override show method of A. which means B class might only be called once so why we use Anonymous Inner Class
//        A obj = new B();
        A obj = new A(){
            public void show(){
                System.out.println("in new show");
            }
            public void config(){
                System.out.println("in new config");
            }
        };

        obj.show();
        obj.config();

    }

}
