package org.example;

public class Pair<T, E> {
    private T element1;
    private E element2;

    public T getElement1() {
        return element1;
    }

    public void setElement1(T element1) {
        this.element1 = element1;
    }

    public E getElement2() {
        return element2;
    }

    public void setElement2(E element2) {
        this.element2 = element2;
    }

    @Override
    public String toString() {
        return "Pair{" +
                "number1=" + element1 +
                ", number2=" + element2 +
                '}';
    }

    public static void pairArr(Pair[] pair) {
        for (Pair value : pair) {
            System.out.println(value);
        }

    }

    public static void main(String[] args) {
        Pair<Integer, String> pair1 = new Pair<>();
        Pair<String, Integer> pair2 = new Pair<>();
        Pair<Float, Integer> pair3 = new Pair<>();
        Pair<Integer, String> pair4 = new Pair<>();
        Pair[] arr1 = new Pair[]{pair1, pair2, pair3, pair4};
        pair1.setElement1(123);
        pair1.setElement2("rare");
        pair2.setElement1("i got it");
        pair2.setElement2(666);
        pair3.setElement1(656.0F);
        pair3.setElement2(123);
        pair4.setElement1(150);
        pair4.setElement2("yes");
        pairArr(arr1);
    }
}



