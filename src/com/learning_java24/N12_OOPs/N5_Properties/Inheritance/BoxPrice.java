package com.learning_java24.N12_OOPs.N5_Properties.Inheritance;

public class BoxPrice extends BoxWeight{

    double price;

    BoxPrice () {
        super();
        this.price = -1;
    }

    BoxPrice (double side, double weight, double price) {
        super(side,weight);
        this.price = price;
    }

    public BoxPrice(double l, double b, double w, double weight, double price) {
        super(l, b, w, weight);
        this.price = price;
    }

}
