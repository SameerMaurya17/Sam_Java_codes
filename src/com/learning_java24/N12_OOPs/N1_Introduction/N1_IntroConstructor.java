package com.learning_java24.N12_OOPs.N1_Introduction;

public class N1_IntroConstructor {

    public static void main(String[] args) {

        Student obj;
        obj = new Student();

        Student sam = new Student();

        sam.rno = 31;
        sam.name = "Sameer";
        sam.marks = 80.2f;

        System.out.println(sam.rno + " " + sam.name + " " + sam.marks);

        Student student1 = new Student(12, "Sam", 69.2f);

        System.out.println(student1.rno + " " + student1.name + " " + student1.marks);

        sam.greeting();

        // copying an obj for creating a new obj
        Student student2 = new Student(student1);

        System.out.println(student2.rno + " " + student2.name + " " + student2.marks);

        // calling a constructor inside a constructor
        Student std = new Student(); // here in default constructor we are calling parameterised constructor
        System.out.println(std.rno + " " + std.name + " " + std.marks);


        // creating two objects where two points to one , and any changes made in one will also affect the two cause it is pointing to the one
        Student one = new Student(100,"deku",88.8f);
        Student two = one;
        System.out.println(two.rno + " " + two.name + " " + two.marks);
        one.name = "Kousei Arima";
        System.out.println(two.rno + " " + two.name + " " + two.marks);
    }

}

 class Student{

    int rno;
    String name;
    float marks;

     void greeting() {
         System.out.println("Hello! My name is " + this.name);
     }

     void changeName(String name) {
         this.name = name;
     }

    // Default constructor it is already present in a class

//     Student(){
//         System.out.println("Obj is created");
//     }

    // this is constructor which is called when object is crated and is mainly used in order to  initializing the values

    // Here now the compiler doesn't know which rno is we are talking about hence, there are two solution for this problem
//     Student(int rno, String name, float marks) {
//        rno = rno;
//        name = name;
//        marks = marks;
//    }

    // First Solution we can either change the names of variable arguments
//     Student(int rollNo, String nam, float numbers) {
//         rno = rollNo;
//         name = nam;
//         marks = numbers;
//     }

     // Second solution is by using "this" keyword

    Student(int rno, String name, float marks) {
        this.rno = rno;
        this.name = name;
        this.marks = marks;
    }

    // Here we have an obj in argument, and here we are using an obj to create another obj
    Student (Student other){

        this.name = other.name;
        this.rno = other.rno;
        this.marks = other.marks;

    }

    // Calling a constructor inside a constructor
    Student () {
         this(17,"sam",16.5f); // here we are calling parameterised constructor into a default constructor
    }

}