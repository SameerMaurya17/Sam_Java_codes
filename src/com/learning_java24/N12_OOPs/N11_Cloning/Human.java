package com.learning_java24.N12_OOPs.N11_Cloning;

public class Human implements Cloneable{  // in Cloneable interface it itself doesn't contain the clone method (clone method is in Object class) it just tells compiler that it is okay to clone it

    int age;
    String name;
    int[] arr;

    public Human(int age, String name) {
        this.age = age;
        this.name = name;
        this.arr = new int[]{1,2,3,4};
    }

//    public Human(Human other) {
//        this.age = other.age;
//        this.name = other.name;
//        this.arr = other.arr;
//    }

//    @Override
//    protected Object clone() throws CloneNotSupportedException { // clone method does shallow coping (pointing to the one in the original obj to the one you're coping)
//       // This is Shallow copy
//        return super.clone();                                   // change in new copied obj will result in the original one (Shallow copy)
//    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        // This is Deep copy
        Human twin = (Human) super.clone(); // this is actually shallow copy

        // making a deep copy
        twin.arr = new int[twin.arr.length];
        for (int i = 0; i < twin.arr.length; i++) {
            twin.arr[i] = this.arr[i];
        }
        return twin;
    }


}
