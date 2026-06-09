package com.learning_java24.N12_OOPs.N6_Access;

import java.util.Objects;

public class ObjectDemo {
    int num;

    float gpa;

    public ObjectDemo(int num,float gpa){
        this.num = num;
        this.gpa = gpa;
    }
    // These 2 covered

    @Override
    public String toString() {
        return super.toString();
    }

    @Override
    protected void finalize() throws Throwable {
        super.finalize();
    }

    @Override
    public int hashCode() {
        return super.hashCode();
    }

    @Override
    public boolean equals(Object obj) {
//        return super.equals(obj);
        return this.num == ((ObjectDemo)obj).num;
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }

    public static void main(String[] args) {

        ObjectDemo obj1 = new ObjectDemo(34,45.3f);
        ObjectDemo obj2 = new ObjectDemo(34,9.3f);

//        System.out.println(obj1.hashCode());

        if(obj1 == obj2){
            System.out.println("obj1 and obj2 are pointing to same thing");
        }
        if(obj1.equals(obj2)){
            System.out.println("obj1 and obj2 contain same values");
        }

        // getClass method of Object class can't be override coz it is finalized
        System.out.println(obj1.getClass().getPackage());

    }

}
