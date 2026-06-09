package com.learning_java24.N12_OOPs.N5_Properties.Inheritance;

public class Main {

    public static void main(String[] args) {


//        Box box1 = new Box(3.8,5.7,5.3);
//
//        System.out.println(box1.l + " " + box1.b + " " + box1.w);
//
//        BoxWeight box2 = new BoxWeight(8.4);
//        System.out.println(box2.l + " " + box2.b + " " + box2.w + " " + box2.weight);

        // here box3 is refering to Boxweight class obj but box3 is of class Box hence it can only access the variables that are present in Box class
//        Box box3 = new BoxWeight(3.8,5.7,5.3,6.6);
//        System.out.println(box3.l + " " + box3.b + " " + box3.w); // Can't access box3.weight cause our reference type variable is of Box class which is refering to BoxType class (hence Box Class doesn't have weight varible in it)


        // there are many variables in both parent and child classes
        // you are given access to variables that are in the ref type i.e. BoxWeight
        // hence, you should have access to weight variable
        // this also means, that the ones you are trying to access should be initialised
        // but here, when the obj itself is of type parent class, how will you call the constructor of child class to initialise the child class variables
        // hence, this is why error

//        BoxWeight box6 = new Box(2, 3, 4);
//        System.out.println(box6);

//        BoxPrice box = new BoxPrice(3.4,5.4,4.7,3.2,4.7);
//        System.out.println(box.l + " " + box.b + " " + box.w + " " + box.weight + " " + box.price);

    }

}
