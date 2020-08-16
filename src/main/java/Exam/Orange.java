package Exam;

import Exam.Fruit;

public class Orange extends Fruit {

    private String taste;

    public Orange() {
        super("orange", "orange");
    }

    public void whatever() {
        printFruitName();
        Fruit fruit = new Fruit("apple", "green");
        fruit.printFruitName();
    }
}
