package com.learning_java24.N14_Collections;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class N11_OptionalClass {

    public static void main(String[] args) {

        List<String> names = Arrays.asList("Sameer" , "Nityam" , "Abir");

//        Optional<String> name = names.stream()
//                                    .filter(str -> str.contains("N"))
//                                    .findFirst();
//
//        System.out.println(name.orElse("Not Found"));

       String name = names.stream()
                            .filter(str -> str.contains("N"))
                            .findFirst()
                            .orElse("Not found");

        System.out.println(name);

    }

}
