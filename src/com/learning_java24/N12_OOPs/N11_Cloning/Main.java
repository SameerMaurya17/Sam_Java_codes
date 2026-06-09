package com.learning_java24.N12_OOPs.N11_Cloning;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) throws CloneNotSupportedException{ // have to throws this exception

        Human sameer = new Human(18,"Sameer");
//        Human twin = sameer; // This is not efficient

        Human twin = (Human) sameer.clone(); // we use Clone method to clone an obj because it is efficient and saves time

        System.out.println(twin.age + " " + twin.name);

        System.out.println(Arrays.toString(twin.arr));

        twin.arr[0] = 100;

        System.out.println(Arrays.toString(sameer.arr));
        // change in new copied obj will result in the original one (Shallow copy)
        // change in new copied obj will not result in the original one (Deep copy)

    }

}
