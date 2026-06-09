package com.sam.CopyPaste;
import java.util.*;
public class jklasfd {

    public static List<Integer> missingNumbers(List<Integer> arr, List<Integer> brr) {
        // Write your code here


        for(int i = 0; i < arr.size(); i++){

            for(int j = 0; j < brr.size(); j++){

                if(Objects.equals(arr.get(i), brr.get(j))){
                    brr.remove(j);
                    break;
                }

            }

        }
        Collections.sort(brr);
        for(int i = 1; i < brr.size(); i++){
            if(Objects.equals(brr.get(i - 1), brr.get(i))){
                brr.remove(i--);
            }
        }
        return brr;
    }

    public static void main(String[] args) {

        List<Integer> list1 = new ArrayList<>();
        List<Integer> list2 = new ArrayList<>();

        list1.add(203 );
        list1.add(204 );
        list1.add(205 );
        list1.add(206 );
        list1.add(207);
        list1.add(208 );
        list1.add(203 );
        list1.add(204 );
        list1.add(205 );
        list1.add(206);

        list2.add(203 );
        list2.add(204 );
        list2.add(204 );
        list2.add(205 );
        list2.add(205 );
        list2.add(205 );
        list2.add(206);
        list2.add(207 );
        list2.add( 205 );
        list2.add( 208 );
        list2.add(203);
        list2.add(206 );
        list2.add(205 );
        list2.add(206 );
        list2.add(204);

        System.out.println(missingNumbers(list1,list2));

    }

}


