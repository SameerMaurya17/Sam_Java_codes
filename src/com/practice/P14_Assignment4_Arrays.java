package com.practice;
import java.util.Scanner;
import java.util.Arrays;
import java.util.ArrayList;
import java.util.List;


public class P14_Assignment4_Arrays{

    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);

// Ques1) Build Array from Permutation

//        System.out.print("Enter how big array you want: ");
//        int n = sc.nextInt();
//        int[] arr = new int[n];
//        System.out.print("Enter the elements of array: ");
//        for(int i=0;i<n;i++){
//            arr[i] = sc.nextInt();
//        }
//        BuildArray(arr);

// Quest2) Concatenation of Array

//        System.out.print("Enter how big array you want: ");
//        int n = sc.nextInt();
//        int[] arr = new int[n];
//        System.out.print("Enter the elements of array: ");
//        for(int i=0;i<n;i++){
//            arr[i] = sc.nextInt();
//        }
//        ConcatenationArray(arr);

// Ques3) Running Sum of 1d Array

//        System.out.print("Enter how big array you want: ");
//        int n = sc.nextInt();
//        int[] arr = new int[n];
//        System.out.print("Enter the elements of array: ");
//        for(int i=0;i<n;i++){
//            arr[i] = sc.nextInt();
//        }
//        RunningArraySum(arr);

// Ques4) Richest Customer Wealth

//        System.out.print("Enter Rows and Column: ");
//        int m = sc.nextInt();
//        int n = sc.nextInt();
//        int[][] accounts = new int[m][n];
//        for(int i=0;i<m;i++){
//            for (int j = 0; j < n; j++) {
//                accounts[i][j] = sc.nextInt();
//            }
//        }
//        AccountCheckingRichest(accounts);

// Ques5) Shuffle the Array

//        System.out.print("Enter how big array you want: ");
//        int n = sc.nextInt();
//        int[] arr = new int[n];
//        System.out.print("Enter the elements of array: ");
//        for(int i=0;i<n;i++){
//            arr[i] = sc.nextInt();
//        }
//        int a = arr.length/2;
//        ShuffleArray(arr,a);

// Ques6) Kids With the Greatest Number of Candies

//        System.out.print("Enter how big array you want: ");
//        int n = sc.nextInt();
//        int[] arr = new int[n];
//        System.out.print("Enter the elements of array: ");
//        for(int i=0;i<n;i++){
//            arr[i] = sc.nextInt();
//        }
//        System.out.print("Enter the extra candies: ");
//        int extraCandies = sc.nextInt();
//        GreatestNoCandies(arr,extraCandies);

// Ques7) Number of Good Pairs

//        System.out.print("Enter how big array you want: ");
//        int n = sc.nextInt();
//        int[] arr = new int[n];
//        System.out.print("Enter the elements of array: ");
//        for(int i=0;i<n;i++){
//            arr[i] = sc.nextInt();
//        }
//        GoodPairs(arr);

// Ques8) How Many Numbers Are Smaller Than the Current Number

//        System.out.print("Enter how big array you want: ");
//        int n = sc.nextInt();
//        int[] arr = new int[n];
//        System.out.print("Enter the elements of array: ");
//        for(int i=0;i<n;i++){
//            arr[i] = sc.nextInt();
//        }
//        SmallerNumbers(arr);

// Ques9) Create Target Array in the Given Order

//        System.out.print("Enter how big Target array you want: ");
//        int n = sc.nextInt();
//        int[] arr = new int[n];
//        System.out.print("Enter the elements of Target array: ");
//        for(int i=0;i<n;i++){
//            arr[i] = sc.nextInt();
//        }
//        System.out.print("Enter how big Index array you want: ");
//        int n1 = sc.nextInt();
//        int[] arr1 = new int[n1];
//        System.out.print("Enter the elements Index of array: ");
//        for(int i=0;i<n1;i++){
//            arr1[i] = sc.nextInt();
//        }
//        TargetArray(arr,arr1);

// Ques10) Check if the Sentence Is Pangram

//        System.out.print("Enter the String: ");
//        String str = sc.next();
//        PangramCheck(str);

// Ques11)  Count Items Matching a Rule

//        System.out.print("Enter how many items you want to add: ");
//        int n = sc.nextInt();
//        ArrayList<ArrayList<String>> items = new ArrayList<ArrayList<String>>(n);
//        for (int i = 0; i < n; i++) {
//            items.add(new ArrayList<String>());
//        }
//        for (int i = 0; i < items.size(); i++) {
//            System.out.print("Enter the "+(i+1)+" items: ");
//            for (int j = 0; j < 3; j++) {
//                items.get(i).add(sc.next());
//            }
//        }
//        System.out.print("Enter the rulekey: ");
//        String rulekey = sc.next();
//        System.out.print("Enter the rulevalue: ");
//        String rulevalue = sc.next();
//        CountItemsMatchingARule(items,rulekey,rulevalue);

// Ques12) Find the Highest Altitude
//        System.out.print("Enter how array you want: ");
//        int n = sc.nextInt();
//        int[] arr = new int[n];
//        System.out.print("Enter the elements in array: ");
//        for (int i = 0; i < arr.length; i++) {
//            arr[i] = sc.nextInt();
//        }
//        HighestAltitude(arr);

// Ques13)  Flipping an Image

//        System.out.print("Enter the length of matrix: ");
//        int n = sc.nextInt();
//        int[][] matrix = new int[n][n];
//        System.out.print("Enter the elements in array: ");
//        for (int i = 0; i < n; i++) {
//            for (int j = 0; j < n; j++) {
//                matrix[i][j] = sc.nextInt();
//            }
//        }
//        FlippingAnImage(matrix);

// Ques14) Cells with Odd Values in a Matrix

//        System.out.print("Enter the length of matrix row: ");
//        int m = sc.nextInt();
//        System.out.print("Enter the length of matrix column: ");
//        int n = sc.nextInt();
//        int[][] matrix = new int[2][2];
//        System.out.print("Enter the indicies: ");
//        for (int i = 0; i < 2; i++) {
//            for (int j = 0; j < 2; j++) {
//                matrix[i][j] = sc.nextInt();
//            }
//        }
//        OddCellsValue(matrix,m,n);

// Ques15) Matrix Diagonal Sum

//        System.out.print("Enter the length of matrix row: ");
//        int m = sc.nextInt();
//        System.out.print("Enter the length of matrix column: ");
//        int n = sc.nextInt();
//        int[][] matrix = new int[m][n];
//        System.out.print("Enter the matrix: ");
//        for (int i = 0; i < m; i++) {
//            for (int j = 0; j < n; j++) {
//                matrix[i][j] = sc.nextInt();
//            }
//        }
//        MatrixDiagonalSum(matrix);

// Ques16) Find Numbers with Even Number of Digits

//        System.out.print("Enter how big array you want: ");
//        int n = sc.nextInt();
//        int[] arr = new int[n];
//        System.out.print("Enter the elements of array: ");
//        for(int i=0;i<n;i++){
//            arr[i] = sc.nextInt();
//        }
//        NossWithEvenNoofDigits(arr);

// Ques17) Transpose Matrix

//        System.out.print("Enter the length of matrix row: ");
//        int m = sc.nextInt();
//        System.out.print("Enter the length of matrix column: ");
//        int n = sc.nextInt();
//        int[][] matrix = new int[m][n];
//        System.out.print("Enter the matrix: ");
//        for (int i = 0; i < m; i++) {
//            for (int j = 0; j < n; j++) {
//                matrix[i][j] = sc.nextInt();
//            }
//        }
//        TransposeMatrix(matrix);

// Ques18) Add to Array-Form of Integer

//        System.out.print("Enter how big array you want: ");
//        int n = sc.nextInt();
//        int[] arr = new int[n];
//        System.out.print("Enter the elements of array: ");
//        for(int i=0;i<n;i++){
//            arr[i] = sc.nextInt();
//        }
//        System.out.print("Enter the value of k: ");
//        int k = sc.nextInt();
//        ArrayFormInteger(arr,k);

        boolean[] ans = new boolean[4];
        Arrays.fill(ans, true);
        ans[0] = false;
        ans[2] = false;
        System.out.println(Arrays.toString(ans));

    }

// Ques19) 

// Ques18) Add to Array-Form of Integer

    static void ArrayFormInteger(int[] nums ,int k){

// Approach 2 -----------------------------------------------------------------------------------------------------------

        int len = nums.length-1;
        List<Integer> ans = new ArrayList<>();

        while(len >= 0 || k != 0){
            if(len>=0){
                k += nums[len];
                len--;
            }
            ans.addFirst(k%10);
            k /= 10;
        }
        System.out.println(ans);


// Approach 1 -----------------------------------------------------------------------------------------------------------
//        long intNum = 0l;
//        List<Integer> ans = new ArrayList<Integer>(3);
//        for (int i = 0; i < nums.length; i++) {
//            intNum*=10;
//            intNum += nums[i];
////            System.out.print(intNum+" ");
//        }
//        //System.out.println(intNum);
//
//        intNum += k;
//
//        //System.out.println(intNum);
////        With List----------
//        while(intNum>0){
//            ans.addFirst((int) (intNum%10));
////            System.out.print(ans+" ");
//            intNum/=10;
//        }
//        //With For loop---------
////        for (int i = nums.length-1;i>0 ; i--) {
////            nums[i] = intNum%10;
////            intNum/=10;
////            nums[i-1] = intNum%10;
////        }
//        //With While loop---------
////        int count = nums.length-1;
////        while(intNum>0){
////            nums[count]= intNum%10;
////            intNum/=10;
////            count--;
////        }
////        System.out.println(Arrays.toString(nums));
//        System.out.println(ans);


    }


// Ques17) Transpose Matrix

    static void TransposeMatrix(int[][] matrix){
        int[][] transposedMatrix = new int[matrix[0].length][matrix.length];
        for (int i = 0; i < transposedMatrix.length; i++) {
            for (int j = 0; j < transposedMatrix[i].length; j++) {
                transposedMatrix[i][j] = matrix[j][i];
            }
        }
        for (int i = 0; i < transposedMatrix.length; i++) {
            System.out.println(Arrays.toString(transposedMatrix[i]));
        }
    }

// Ques16) Find Numbers with Even Number of Digits

    static void NossWithEvenNoofDigits(int[] nums){
        int count = 0;
        int even = 0;
        for (int i = 0; i < nums.length; i++) {
            while(nums[i]>0){
                nums[i]/=10;
                count++;
            }
            if(count%2==0){
                even++;
            }
            count = 0;
        }
        System.out.println(even);
    }

// Ques15) Matrix Diagonal Sum

    static void MatrixDiagonalSum(int[][] mat){
        int sum =0;
        int count = mat.length-1;
        for (int i = 0; i < mat.length; i++) {
            for (int j = 0; j < mat[i].length; j++) {
                if(i==j){
                    sum += mat[i][j];
                }
            }
            if(i != count){
                sum += mat[i][count];
            }
            count--;
        }
        System.out.println(sum);
    }

// Ques14) Cells with Odd Values in a Matrix

    static void OddCellsValue(int[][] indicies, int m, int n){
        int count=0;
        int[][] matrix = new int[m][n];
        for (int i = 0; i < indicies.length; i++) {
            for (int j = 0; j < n; j++) {
                matrix[indicies[i][0]][j]++;
            }
            for (int j = 0; j < m; j++) {
                matrix[j][indicies[i][1]]++;
            }
        }
        for (int i = 0; i < m; i++) {
            System.out.println(Arrays.toString(matrix[i]));
        }
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if(matrix[i][j]%2!=0){
                    count++;
                }
            }
        }
        System.out.println(count);
    }

// Ques13)  Flipping an Image

    static void FlippingAnImage(int[][] image){
        int[][] newImage = new int[image.length][image.length];
        for (int i = 0; i < image.length; i++) {
            int count =0;
            for (int j = image.length-1; j >= 0 ; j--) {
                newImage[i][count] = image[i][j];
                count++;
            }
            for (int j = 0; j < image.length; j++) {
                if(newImage[i][j] == 1){
                    newImage[i][j] = 0;
                }else{
                    newImage[i][j] = 1;
                }
            }
        }
        for (int i = 0; i < image.length; i++) {
            System.out.println(Arrays.toString(newImage[i]));
        }
    }

// Ques12) Find the Highest Altitude

    static void HighestAltitude(int[] nums){
        int count =0;
        int max =0;
        int[] arr = new int[nums.length+1];
        arr[0] = 0;
        for (int i = 0; i < nums.length; i++) {
            arr[i+1] = arr[i]+nums[i];
            if(max<arr[i]){
                max = arr[i];
            }
        }
        System.out.println(max);
    }

// Ques11)  Count Items Matching a Rule

    static void CountItemsMatchingARule(ArrayList<ArrayList<String>> items, String ruleKey, String ruleValue){
        int count = 0;
        int col = 0;
        System.out.println(ruleKey);
        switch(ruleKey){
            case "type":
                col = 0;
                break;
                case "color":
                col = 1;
                break;
                case "name":
                col = 2;
                break;
        }
        for(int i=0;i<items.size();i++){
            ArrayList<String> item = items.get(i);
            if(item.get(col).equals(ruleValue)){
                count++;
            }
        }
//        for(int i=0;i<items.size();i++){
//            System.out.println(items.get(i).get(col));
//        }
        System.out.println(count);
    }

// Ques10) Check if the Sentence Is Pangram

    static void PangramCheck(String sentence){
       int[] count = new int[26];
       boolean ans =true;
        for (int i = 0; i < sentence.length(); i++) {
            count[(sentence.charAt(i)-'a')]++;
        }
        for (int i = 0; i < count.length; i++) {
            if(count[i]<1){
                ans = false;
            }else{
                ans = true;
            }
        }
        System.out.println(ans);
    }

// Ques9) Create Target Array in the Given Order

    static void TargetArray(int[] nums, int[] index){
        int[] target = new int[nums.length];
        for (int i = 0; i < target.length; i++) {
            if(index[i]<=i){
                for (int j = target.length-1; j > index[i]; j--) {
                    target[j] = target[j-1];
                }
            }
            target[index[i]] = nums[i];
        }
        System.out.println(Arrays.toString(target));
    }

// Ques8) How Many Numbers Are Smaller Than the Current Number

    static void SmallerNumbers(int[] nums){
        int[] ans = new int[nums.length];
        for (int i = 0; i < nums.length; i++) {
            int count =0;
            for (int j = 0; j < nums.length; j++) {
                if(nums[i]>nums[j]){
                    count++;
                }
                ans[i] = count;
            }
        }
        System.out.println(Arrays.toString(ans));
    }

//Ques 7) Number of Good Pairs

    static void GoodPairs(int[] nums){
        int GoodPairs = 0;
        for (int i = 0; i < nums.length; i++) {
            for (int j = i+1; j < nums.length; j++) {
                if(nums[i] == nums[j]){
                    GoodPairs++;
                }
            }
        }
        System.out.println(GoodPairs);
    }

// Ques6) Kids With the Greatest Number of Candies

    static void GreatestNoCandies(int[] candies, int extraCandies){
        boolean[] ans = new boolean[candies.length];
        for (int i = 0; i < candies.length; i++) {
            for (int j = 0; j < candies.length; j++) {
                if(candies[i]+extraCandies>=candies[j]){
                    ans[i] = true;
                }else{
                    ans[i] = false;
                    break;
                }
            }
        }
        System.out.println(Arrays.toString(ans));
    }

// Ques5) Shuffle the Array

    static void ShuffleArray(int[] nums, int n){
        int[] ans = new int[n*2];
        for (int i = 0; i < n; i++) {
            ans[i+i] = nums[i];
            ans[i+i+1] = nums[n+i];
        }
        System.out.println(Arrays.toString(ans));
    }

// Ques4) Richest Customer Wealth

    static void AccountCheckingRichest(int[][] accounts){
        int[] sum = new  int[accounts.length];
        int wealth = 0;
        for (int i = 0; i < accounts.length; i++) {
            for (int j = 0; j < accounts[i].length; j++) {
                sum[i] += accounts[i][j];
            }
        }
        for (int i = 0; i < sum.length; i++) {
            if(wealth<=sum[i]){
                wealth=sum[i];
            }
        }
        System.out.println(wealth);
    }

// Ques3) Running Sum of 1d Array

    static void RunningArraySum(int[] arr){
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            arr[i] = arr[i]+ sum;
            sum =+ arr[i];
        }
        System.out.println("The array is: "+Arrays.toString(arr));
    }

//Ques2) Concatenation of Array

    static void ConcatenationArray(int[] arr){
        int ans[] = new int[arr.length*2];
        for(int i=0;i<arr.length;i++){
            ans[i] = arr[i];
        }
        for(int i=0;i<arr.length;i++){
            ans[i+arr.length] = arr[i];
        }
        System.out.println("The array is: "+Arrays.toString(ans));
    }

// Ques1) Build Array from Permutation
    static void BuildArray(int[] arr){
        int[] ans = new int[arr.length];
        for(int i=0;i<arr.length;i++){
            ans[i] = arr[arr[i]];
        }
        System.out.println("The array is ");
        for(int i=0;i<arr.length;i++){
            System.out.print(ans[i]+" ");
        }
    }

}