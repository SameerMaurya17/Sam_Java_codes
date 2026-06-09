package com.learning_java24.N12_OOPs.N5_Properties.Polymorphism;

public class ObjectPrint {

    int n;

    public ObjectPrint(int n) {
        this.n = n;
    }

    @Override
    public String toString() {
        return "ObjectPrint{" +
                "n=" + n +
                '}';
    }

    public static void main(String[] args) {

        ObjectPrint obj = new ObjectPrint(69);

        System.out.println(obj);

    }
}
