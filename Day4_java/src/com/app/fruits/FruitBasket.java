package com.app.fruits;

import java.util.ArrayList;
import java.util.Scanner;

public class FruitBasket {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Fruit> basket = new ArrayList<>();
        int counter = 0;

        while (true) {
            System.out.println("Fruit Basket Options:");
            System.out.println("0. Exit");
            System.out.println("1. Add Mango");
            System.out.println("2. Add Orange");
            System.out.println("3. Add Apple");
            System.out.println("4. Display names of all fruits in the basket");
            System.out.println("5. Display name, color, weight, and taste of all fresh fruits");
            System.out.println("6. Display tastes of all stale fruits");
            System.out.println("7. Mark a fruit as stale");
            System.out.println("8. Mark all sour fruits stale (optional)");

            int choice = scanner.nextInt();
            switch (choice) {
                case 0:
                    System.out.println("Exiting Fruit Basket.");
                    scanner.close();
                    return;
                case 1:
                    System.out.println("Enter color and weight for Mango:");
                    String colorMango = scanner.next();
                    double weightMango = scanner.nextDouble();
                    basket.add(new Mango(colorMango, weightMango));
                    counter++;
                    break;
                case 2:
                    System.out.println("Enter color and weight for Orange:");
                    String colorOrange = scanner.next();
                    double weightOrange = scanner.nextDouble();
                    basket.add(new Orange(colorOrange, weightOrange));
                    counter++;
                    break;
                case 3:
                    System.out.println("Enter color and weight for Apple:");
                    String colorApple = scanner.next();
                    double weightApple = scanner.nextDouble();
                    basket.add(new Apple(colorApple, weightApple));
                    counter++;
                    break;
                case 4:
                    for (Fruit fruit : basket) {
                        if (fruit != null) {
                            System.out.println(fruit.name);
                        }
                    }
                    break;
                case 5:
                    for (Fruit fruit : basket) {
                        if (fruit != null && fruit.isFresh) {
                            System.out.println(fruit.toString() + ", Taste: " + fruit.taste());
                        }
                    }
                    break;
                case 6:
                    for (Fruit fruit : basket) {
                        if (fruit != null && !fruit.isFresh) {
                            System.out.println(fruit.taste());
                        }
                    }
                    break;
                case 7:
                    System.out.println("Enter the index of the fruit to mark as stale:");
                    int index = scanner.nextInt();
                    if (index >= 0 && index < counter) {
                        basket.get(index).isFresh = false;
                        System.out.println("Fruit marked as stale.");
                    } else {
                        System.out.println("Invalid index.");
                    }
                    break;
                case 8:
                    for (Fruit fruit : basket) {
                        if (fruit != null && "Sour".equals(fruit.taste())) {
                            fruit.isFresh = false;
                        }
                    }
                    System.out.println("All sour fruits marked as stale.");
                    break;
                default:
                    System.out.println("Invalid choice. Please try again.");
                    break;
            }
        }
    }
}

