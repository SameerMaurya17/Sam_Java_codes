package com.learning_java24.N12_OOPs.N9_Generics;

import java.util.Arrays;
import java.util.List;

// https://docs.oracle.com/javase/tutorial/java/generics/restrictions.html#createObjects

// here T should either be Number or its subclasses
public class WildcardExample<T extends Number > { // extends Class_Name this is wildcard (restricting)

    private Object[] data;
    private static int DEFAULT_VALUE = 10;
    private int size = 0;

    public void getList(List<? extends Number> list){ // Wildcards
        // if it was only List<Number> then it can only pass Number Type
        // but now its List<? extends Number> which means now it can also pass its subclass type
    }


    public WildcardExample() {
        this.data = new Object[DEFAULT_VALUE];
    }

    public void add(T num){
        if(isFull()){
            resize();
        }
        data[size++] = num;
    }

    public boolean isFull() {
        return data.length == size;
    }

    public void resize() {
        Object[] temp = new Object[data.length * 2];

        // copy the current items in the new array
        for (int i = 0; i < data.length; i++){
            temp[i] = data[i];
        }
        data = temp;
    }

    public T remove(){
        T removed = (T) data[--size];
        return removed;
    }

    public T get(int index){
        return (T)data[index];
    }

    public int size(){
        return data.length;
    }

    public void set(int index, T value){
        data[index] = value;
    }

    @Override
    public String toString() {
        return "CustomArrayList{" +
                "data=" + Arrays.toString(data) +
                ", size=" + size +
                '}';
    }

    public static void main(String[] args) {
//        ArrayList list = new ArrayList();

//        CustomGenericsArrayList list = new CustomGenericsArrayList();
//
//        list.add(8);
//        list.add(8);
//        list.add(8);
//
//        System.out.println(list.remove());
//
//        System.out.println(list);

        WildcardExample<Number> list = new WildcardExample<Number>();

        list.add(9);
        list.add(9.5f);
//        list.add("sameer"); // now it will give error cause only Number Class value is allowed

        System.out.println(list);

    }

}
