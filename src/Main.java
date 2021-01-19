import ru.geekbrains_lesson7.Cat;
import ru.geekbrains_lesson7.Plate;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Plate plate = new Plate(25);
        plate.info();

        Cat[] cat = {
                new Cat("Cat1", 35),
                new Cat("Cat2", 25),
                new Cat("Cat3", 15),
                new Cat("Cat4", 10)
        };

        meatCat(cat, plate);
        printArrayCat(cat);
        eatMore(plate, cat);

    }

    private static void eatMore(Plate plate, Cat[] cat) {
        boolean eatOnceMore = true;
        do {
            eatOnceMore = addFoodToPlate(plate, cat);
        } while (!checkCatAppetite(cat) && eatOnceMore);
    }

    private static boolean addFoodToPlate(Plate plate, Cat[] cat) {
        int moreEat;
        do {
            plate.info();
            Scanner ask = new Scanner(System.in);
            System.out.println("Добавить еды в тарелку? да - 1, нет - 0");
            moreEat = ask.nextInt();
        } while (moreEat != 0 && moreEat != 1);
        if (moreEat == 1) {
            Scanner f = new Scanner(System.in);
            System.out.println("Сколько еды добавить еды в тарелку?");
            plate.addFood(f.nextInt());
            plate.info();
            meatCat(cat, plate);
            printArrayCat(cat);
            return true;
        } else {
            return false;
        }
    }

    private static void meatCat(Cat[] cat, Plate plate) {
        for (int i = 0; i < cat.length; i++) {
            if (plate.getFood() > 0) {
                if (cat[i].isSatiety() != true) {
                    if (plate.getFood() >= cat[i].getAppetite()) {
                        plate.decreaseFood(cat[i].getAppetite());
                        cat[i].setSatiety(true);
                    }
                }
            };
        }
    }

    private static boolean checkCatAppetite(Cat[] cat) {
        int n = 0;
        for (int i = 0; i < cat.length; i++) {
            if (cat[i].setSatiety() == true) {
                n = n + 1;
            }
        }
        if (n == cat.length) {
            return true;
        } else return false;
    }

    private static void printArrayCat(Cat[] cat) {
        for (int i = 0; i < cat.length; i++) {
            cat[i].printCat(cat[i].setSatiety());
        }
    }
}


