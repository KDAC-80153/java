package com.app.fruits;

class Fruit {
    String name;
    String color;
    double weight;
    boolean isFresh;

    public Fruit(String name, String color, double weight) {
        this.name = name;
        this.color = color;
        this.weight = weight;
        this.isFresh = true;
    }

    @Override
    public String toString() {
        return "Name: " + name + ", Color: " + color + ", Weight: " + weight;
    }

    public String taste() {
        return "No specific taste";
    }
}

class Apple extends Fruit {
    public Apple(String color, double weight) {
        super("Apple", color, weight);
    }

    @Override
    public String taste() {
        return "Sweet and sour";
    }
}

class Orange extends Fruit {
    public Orange(String color, double weight) {
        super("Orange", color, weight);
    }

    @Override
    public String taste() {
        return "Sour";
    }
}

class Mango extends Fruit {
    public Mango(String color, double weight) {
        super("Mango", color, weight);
    }

    @Override
    public String taste() {
        return "Sweet";
    }



}
