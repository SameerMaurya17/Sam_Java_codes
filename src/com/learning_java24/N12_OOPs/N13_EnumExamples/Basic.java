package com.learning_java24.N12_OOPs.N13_EnumExamples;

public class Basic {

    enum Week implements A{
        Monday, Tuesday, Wednesday, Thursday, Friday, Saturday, Sunday;
        // These are enum constants
        // Public, Static and Final
        // Since its Final you can't create child enums
        // Type is Week

//        void display(); // can't have abstract methods cuz they are not going to be inherited (Cuz of the Final keyword)

        void display(){ // Methods must have their own body

        }

        @Override
        public void greet(){
            System.out.println("Hello");
        }

        Week(){ // Constructor can only be of private or default private (not public or protected)
            System.out.println("Constructor called for " + this);
        }
        // This is not public or protected, only private and default private
        // Why? we don't want to create new objects

        // Cuz This is not the enum concept, that's why

        // Internally: public static final Week Monday = new Week();
    }

    public static void main(String[] args) {

        Week week;
        week = Week.Monday;

//        week.greet();

//        System.out.println(Week.valueOf("Monday"));
//
//        for(Week day: Week.values()){
//            System.out.println(day);
//        }

//        System.out.println(week.ordinal()); // Gives index of constants

    }

}
