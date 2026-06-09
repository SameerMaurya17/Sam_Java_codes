package com.learning_java24.N14_Collections;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class N10_ParallelStream {

    public static void main(String[] args) {

        int size = 10_000;

        List<Integer> nums = new ArrayList<>(size);

        Random ran = new Random();

        for (int i = 0; i < size; i++) {
            nums.add(ran.nextInt(100));
        }

//        int sum1 = nums.stream()
//                        .map(n -> n*2)
//                        .reduce(0,(c,e) -> c + e);

        long startSeq = System.currentTimeMillis();
        int sum2 = nums.stream()
                        .map(n -> {
                            try {
                                Thread.sleep(1);
                            }catch(Exception e){
                            }
                            return n*2;
                        })
                        .mapToInt(i -> i)
                        .sum();
        long endSeq = System.currentTimeMillis();


        long startPara = System.currentTimeMillis();
        int sum3 = nums.parallelStream()
                        .map(n -> {
                            try {
                                Thread.sleep(1);
                            }catch(Exception e){
                            }
                            return n*2;
                        })
                        .mapToInt(i -> i)
                        .sum();
        long endPara = System.currentTimeMillis();


        System.out.println(sum2 + " " + (endSeq - startSeq));
        System.out.println(sum3 + " " + (endPara - startPara));

    }

}
