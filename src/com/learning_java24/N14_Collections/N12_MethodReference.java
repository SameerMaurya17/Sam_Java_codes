package com.learning_java24.N14_Collections;

import java.util.Arrays;
import java.util.List;

public class N12_MethodReference {

    public static void main(String[] args) {

        List<String> names = Arrays.asList("Sameer" , "Nityam" , "Abir");

//        List<String> uNames = names.stream()
//                                    .map(n -> n.toUpperCase())
//                                    .toList();
//
//        System.out.println(uNames);

        List<String> uNames = names.stream()
                .map(String::toUpperCase) // This is known as Method Reference
                .toList();

        System.out.println(uNames);

        uNames.forEach(System.out::println);

    }

}
