package com.learning_java24.N12_OOPs.N5_Properties.Inheritance;

public class Box { // You can put final so the other class won't be able to inherit this class
                   // And all of the methods of the class will be converted into final

    double l;
    double b;
    double w;
//    double weight;

    Box () {
        l = -1;
        b= -1;
        w = -1;
    }

    // Cube
    public Box(double side) {
        this.l = side;
        this.b = side;
        this.w = side;
    }

    public Box(double l, double b, double w) {
        System.out.println("Box Class Constructor");
        this.l = l;
        this.b = b;
        this.w = w;
    }

    public Box(Box old) {
        this.l = old.l;
        this.b = old.b;
        this.w = old.w;
    }

    public static void information(){
        System.out.println("Running the box");
    }

}
