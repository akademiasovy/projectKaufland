package sk.itsovy.main;

import sk.itsovy.bill.Bill;
import sk.itsovy.exception.BillException;
import sk.itsovy.items.Category;
import sk.itsovy.items.Goods;
import sk.itsovy.items.Item;
import sk.itsovy.items.drink.Bottle;
import sk.itsovy.items.drink.Draft;
import sk.itsovy.items.drink.Drink;
import sk.itsovy.items.food.Food;
import sk.itsovy.items.food.Fruit;
import sk.itsovy.items.food.Pastry;

public class Application {

    public void example () throws BillException {
        Bill bill = new Bill();

        bill.print();
        Bottle milk=new Bottle("milk 1,5 %",0.59,2);
        bill.addItem(milk);
        Item pizza = new Pastry("Gazdovska",1.10,280, 2);
        bill.addItem(pizza);
        Food apple = new Fruit("Red aplle",0.59,0.370);
        bill.addItem(apple);
        Goods pencil = new Goods("Pencil 0.5", 0.60,1,Category.SCHOOL);
        bill.addItem(pencil);
        Draft vinea= new Draft("White vinea",1.20,true,0.3);
        bill.addItem(vinea);
        bill.addItem(null);
        Draft beer= new Draft("Birell lemon",1,true,0.5);
        bill.addItem(beer);
        bill.removeItem(beer);
        bill.print();
    }
}
