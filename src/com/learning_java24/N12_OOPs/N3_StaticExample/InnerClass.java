package com.learning_java24.N12_OOPs.N3_StaticExample;
public class InnerClass {

    public static class Test {
        String name;
        public Test(String name){
            this.name = name;
        }
        @Override
        public String toString() {
            return name;
        }
    }
    public static void main(String[] args) {

        Test obj1 = new Test("Sameer");
        Test obj2 = new Test("Nityam");

        System.out.println(obj1.name);
        System.out.println(obj2.name);

        // Overriding the toString method
        System.out.println(obj1);
        System.out.println(obj2);

    }

}
