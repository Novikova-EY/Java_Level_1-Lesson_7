package ru.geekbrains_lesson7;

public class Plate {
    private int food;

    public Plate(int food) {
        this.food = food;
    }

    public int getFood() {
        return food;
    }

    public void decreaseFood(int n) {
        food -= n;
    }

    public void addFood(int moreFood) {
        food += moreFood;
    }

    public void info(){
        System.out.println("В тарелке находится " + food + " г. еды.");
    }
}
