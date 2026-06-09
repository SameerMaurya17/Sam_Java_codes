package com.learning_java24.N14_Collections;

import java.util.Collections;
import java.util.List;
import java.util.ArrayList;
import java.util.Comparator;

//class Student implements Comparable<Student> // Comparable is an interface in which it has a compareTo method which is used to define the logic for sorting the objects of class
class Student
{
    int age;
    String name;

    public Student(int age, String name)
    {
        this.age=age;
        this.name=name;
    }

    public String toString() {
        return "Student [age=" + age + ", name=" +name +"]";
    }

	public int compareTo(Student that)
	{
//		return 0;
		if(this.age > that.age)
			return 1;
		else
			return -1;
	}
}
public class N5_Comparator_VS_Comparable {

    public static void main(String[] args) {

//        List<Integer> nums = new ArrayList<>();
//
//        nums.add(95);
//        nums.add(33);
//        nums.add(58);
//        nums.add(71);
//
//        System.out.println(nums);
//
//        Collections.sort(nums); // sorts the list
        // but what if we want to make our own logic to sort the items then,

        //then in that case we can use Comparator which we can pass in sort() to tell ours new logic to sort the elements

//        Comparator<Integer> com = new Comparator<>() {
//            @Override
//            public int compare(Integer a, Integer b) {
//                if(a%10 > b%10){
//                    return 1; // 1 means swap
//                }
//                return -1; // -1 means no swap
//            }
//
//        };

        // I can also use the lambda expression

//        Comparator<Integer> com = (a, b) -> a%10 > b%10? 1 : -1;

        // Now I can pass this com obj to tell my sort() function i want this logic
//        Collections.sort(nums,com);
//
//
//        System.out.println(nums);

        //    	Comparator<Student> com=new Comparator<Student>()
//    	{
//    		public int compare(Student i,Student j)
//    		{
//    			if(i.age >j.age)
//    				return 1;
//    			else
//    				return -1;
//    		}
//    	};

        // We can also use lambda expression
        Comparator<Student> com=(i,j) -> i.age > j.age?1:-1;


        List<Student> studs= new ArrayList<>();
        studs.add(new Student(21,"Navin"));
        studs.add(new Student(12,"John"));
        studs.add(new Student(18,"Parul"));
        studs.add(new Student(20,"Kiran"));

        for(Student s:studs)
            System.out.println(s);

        Collections.sort(studs,com); // when we do sort on objects of class which doesn't implements the Comparable interface or we have not provided any comparator to that function then, it will give an error cause our function will not know the logic for sorting the elements
//         hence that object class should implement the Comparable interface

        System.out.println();
        for(Student s: studs)
            System.out.println(s);


    }

}
