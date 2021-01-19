package ru.geekbrains_lesson7;

public class Cat {

    private String name;
    private int appetite;
    private boolean satiety = false;

    public Cat(String name, int appetite) {
        this.name = name;
        this.appetite = appetite;
    }

    public int getAppetite() {
        return appetite;
    }

    public boolean isSatiety() {
        return satiety;
    }

    public boolean setSatiety(boolean a) {
        this.satiety = a;
        return this.satiety;
    }
    public boolean setSatiety() {
        return this.satiety;
    }

    public void printCat(boolean satiety) {
        if (satiety == true) {
            System.out.println(String.format(
                    "%s (аппетит: %s г.) наелась",
                    name,
                    appetite
            ));
        } else {
            System.out.println(String.format(
                    "%s (аппетит: %s г.) осталась голодной",
                    name,
                    appetite
            ));
        }
    }
}
