package sk.itsovy.items.drink;

import sk.itsovy.items.Item;

public abstract class Drink extends Item {
private boolean sweet;
    public  Drink(String name, double price, boolean sweet) {
        super(name, price);
        this.sweet=sweet;
    }

}
