package com.learning_java24.N12_OOPs.N14_LambdaExpression;

// Functional Interface are those Interface which has only one single function (we are use lambda expression with functional interface)
@FunctionalInterface // This is the annotation for the FunctionalInterface
interface A
{
    void show(int a);
//	void run();
}
//class B implements A
//{
//	public void show()
//	{
//		System.out.println("in Show");
//	}
//}


public class Demo {
    public static void main(String[] args) {

// Functional Interface are those Interface which has only one single function (we are use lambda expression with functional interface)
//        A obj = new A()
//        {
//            public void show(a) // we don't even need to mention the variable type
//            {
//                System.out.println("in Show");
//            }
//        };
        //   	A obj=new A();
        //   	A obj=new B();
//        obj.show();

        // We can perform the same thing with the help of Lambda expression to reduce the code

        // we basically removed all the part that is known and is default with an ->
//        A obj = (a) -> { // we don't even need to mention the variable type
//            System.out.println("In Show");
//        };

        // and if the function should contain only one line than there's not even need to put the curly brackets

//        A obj = (a) -> System.out.println("In Show"); // we don't even need to mention the variable type
        A obj = a -> System.out.println("In Show"); // and if we only have one variable we don't even need the normal brackets


        obj.show(6);
    }
}
