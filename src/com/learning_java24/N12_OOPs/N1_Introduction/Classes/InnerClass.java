package com.learning_java24.N12_OOPs.N1_Introduction.Classes;

class Outer {

    int age ;

    public void show(){
        System.out.println("In Show");
    }

    static class  Inner{

        public void config(){
            System.out.println("In config");
        }

    }

}
public class InnerClass {

    public static void main(String[] args) {

        Outer obj = new Outer();
        obj.show();

//        Outer.Inner obj2 = obj.new Inner(); // We need an object of outer class to create an object of inner class (Unless the inner class is static)
//        obj2.config();

        Outer.Inner obj3 = new Outer.Inner(); // Like this if the inner class is static


    }

}
