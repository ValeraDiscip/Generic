package org.example;

import java.util.ArrayList;

public class GenericExample {

    public static void main(String[] args) {
        Box<Fruit> appleBox1 = new Box<>();
        appleBox1.addFruit(new Apple());
        appleBox1.addFruit(new Apple());

        Box<Fruit> appleBox2 = new Box<>();
        appleBox2.addFruit(new Apple());

        Box<Fruit> orangeBox = new Box<>();
        orangeBox.addFruit(new Orange());

        System.out.println("Weight of appleBox1: " + appleBox1.getWeight());
        System.out.println("Weight of appleBox2: " + appleBox2.getWeight());
        System.out.println("Weight of orangeBox: " + orangeBox.getWeight());

        System.out.println("Comparing appleBox1 and appleBox2: " + appleBox1.compare(appleBox2));
        System.out.println("Comparing appleBox1 and orangeBox: " + appleBox1.compare(orangeBox));

        appleBox1.transferFruits(appleBox2);
        System.out.println("After transferring fruits, weight of appleBox1: " + appleBox1.getWeight());
        System.out.println("After transferring fruits, weight of appleBox2: " + appleBox2.getWeight());
    }

    static class Fruit {

    }

    static class Apple extends Fruit {

    }

    static class Orange extends Fruit {

    }

    static class Box<T extends Fruit> {
        private final ArrayList<T> fruits = new ArrayList<>();

        public void addFruit(T fruit) {
            fruits.add(fruit);
        }

        public float getWeight() {
            if (fruits.isEmpty()) {
                return 0.0f;
            }

            float weight = fruits.getFirst() instanceof Apple ? 1.0f : 1.5f;
            return weight * fruits.size();
        }

        public boolean compare(Box<?> anotherBox) {
            return this.getWeight() == anotherBox.getWeight();
        }

        public void transferFruits(Box<T> anotherBox) {
            if (this.getClass() != anotherBox.getClass()) {
                System.out.println("!");
                return;
            }

            anotherBox.fruits.addAll(this.fruits);
            this.fruits.clear();
        }
    }
}
