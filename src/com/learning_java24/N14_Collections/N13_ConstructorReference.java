package com.learning_java24.N14_Collections;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class Students{

    String name;
    int age;

    public Students(String name){
        this.name = name;
    }

    @Override
    public String toString() {
        return "Students{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
public class N13_ConstructorReference {

    public static void main(String[] args) {

        List<String> names = Arrays.asList("Sameer" , "Nityam" , "Abir");

        List<Students> students = new ArrayList<>();

//        for(String name : names){
//            students.add(new Students(name));
//        }
//
//        System.out.println(students);

//        students = names.stream()
//                .map(name -> new Students(name))
//                .toList();
//
//        System.out.println(students);

        students = names.stream()
                .map(Students::new)// Constructor Reference
                .toList();

        System.out.println(students);

    }

}
