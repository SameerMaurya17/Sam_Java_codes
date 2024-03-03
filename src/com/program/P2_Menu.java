package com.program;
import java.util.Scanner;
public class P2_Menu {

    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);

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
