package org.example;


import java.util.ArrayList;
import java.util.Arrays;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static <T> void swap(T[] arr) {
        for (int i = 0; i < arr.length; i++) {
            T element1 = arr[0];
            arr[0] = arr[1];
            arr[1] = element1;
        }
    }


    public static void main(String[] args) {
        Pair<Integer, String> pair1 = new Pair<>();
        Pair<Integer, String> pair2 = new Pair<>();
        Pair<Integer, String> pair3 = new Pair<>();
        pair1.setElement1(1);
        pair1.setElement2("11");
        pair2.setElement1(2);
        pair2.setElement2("22");
        pair3.setElement1(3);
        pair3.setElement2("333");
        Pair[] pairs = new Pair[]{pair1, pair2, pair3};
        swap(pairs);
        System.out.println(Arrays.toString(pairs));

        ArrayList<String> arrayList = new ArrayList<>();
        arrayList.add("s");
    }
}