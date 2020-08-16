package Exam;

public class Fruit {
    private String name;
    private String color;

    public Fruit(String name, String color) {
        this.name = name;
        this.color = color;
    }
    public void printFruit() {
        System.out.println("Fruit is apple");
    }

    public void printFruitName() {
        System.out.println(this.name + " " + this.color);

    }
}
