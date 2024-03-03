package com.learning_java24;
import java.sql.SQLOutput;
import java.util.Scanner;

public class N6_SwitchStatements {

    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);

//        System.out.println("Enter a day: ");
//        int day = sc.nextInt();

    // Switch Statement Old Style (used as if else if check for which value if equal)

//        switch(day){
//
//            case 1:
//                System.out.println("Monday");
//                break;
//            case 2:
//                System.out.println("Tuesday");
//                break;
//            case 3:
//                System.out.println("Wednesday");
//                break;
//            case 4:
//                System.out.println("Thursday");
//                break;
//            case 5:
//                System.out.println("Friday");
//                break;
//            case 6:
//                System.out.println("Saturday");
//                break;
//            case 7:
//                System.out.println("Sunday");
//                break;
//            default:
//                System.out.println("Enter number between 1 to 7");

        // Switch Statement Enhanced version

//                switch (day){
//
//                    case 1 -> System.out.println("Monday");
//                    case 2 -> System.out.println("Tuesday");
//                    case 3 -> System.out.println("Wednesday");
//                    case 4 -> System.out.println("Thursday");
//                    case 5 -> System.out.println("Friday");
//                    case 6 -> System.out.println("Saturday");
//                    case 7 -> System.out.println("Sunday");
//                    default -> System.out.println("Enter number between 1 to 7");

        // Another example

//        switch (day) {
//            case 1:
//            case 2:
//            case 3:
//            case 4:
//            case 5:
//                System.out.println("Weekday");
//                break;
//            case 6:
//            case 7:
//                System.out.println("Weekends");
//                break;
//            default:
//                System.out.println("Enter number between 1 to 7");
//                break;
//        }

//        switch (day){
//
//            case 1,2,3,4,5 -> System.out.println("Weekday");
//            case 6,7 -> System.out.println("Weekend");
//            default -> System.out.println("Enter number between 1 to 7");
//
//        }

        // Nested Switch Case

        System.out.print("Which type of food would you like Non-veg or Veg: ");
        String type = sc.next();

        switch(type){

            case "Non-Veg":
                System.out.println("Menu for Non-Veg is 'ButterChicken,TandooriChicken,Biriyani: ");
                String order1 = sc.next();
                switch(order1){
                    case "ButterChicken" :
                        System.out.println("Here's your order of ButterChicken");
                        break;
                    case "TandooriChicken" :
                        System.out.println("Here's your order of TandooriChicken");
                        break;
                    case "Biriyani" :
                        System.out.println("Here's your order of Biriyani");
                        break;
                }
                break;
            case "Veg":
                System.out.println("Menu for Non-Veg is 'PalakPaneer,MatarPaneer,DalMakhani: ");
                String order2 = sc.next();
                switch(order2){
                    case "PalakPaneer" :
                        System.out.println("Here's your order of PalakPaneer");
                        break;
                    case "MatarPaneer" :
                        System.out.println("Here's your order of MatarPaneer");
                        break;
                    case "DalMakhani" :
                        System.out.println("Here's your order of Dal Makhani");
                        break;
                }

                break;
            default:
                System.out.println("Enter a valid Answer");

        }

    }

}
