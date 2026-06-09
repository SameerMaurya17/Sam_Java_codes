package com.learning_java24.N12_OOPs.N5_Properties.Inheritance;

public class BoxWeight extends Box{

    double weight;

    // Static methods can't be overriding
//    @Override
//    public static void information(){
//        System.out.println("Running the boxWeight");
//    }

    public BoxWeight() {
        super();
        this.weight = -1;
    }

    public BoxWeight(double weight) {
        this.weight = weight;
    }

    BoxWeight (BoxWeight other){
        super(other); // here we are passing BoxWeight obj to Box class constructor which will have reference to BoxW eight type obj
        weight = other.weight;
    }

    public BoxWeight(double side,double weight) {
        super(side);
        this.weight = weight;
    }

    BoxWeight (double l, double b, double w, double weight) {

        // Super constructor is first thing to call in child constructor or it will give an error
        super(l,b,w); // used to call parent class constructor
        // used to initialized values present in parent class

//        System.out.println(super.weight); // super is used when you need to call parent class variable but that variable is also present in child class with same name
        // hence we use super keyword then to access the variables of parent class
        // in here if we use this.weight it will call the child class weight but if we use super.weight it will call the weight variable of parent class

        this.weight = weight;
//        super(l,b,w); // we can't call super constructor here cause it needs to be first thing to be called in child constructor
    }

}
