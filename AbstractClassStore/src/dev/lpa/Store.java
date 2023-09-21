package dev.lpa;

import java.util.ArrayList;

public class Store {
    private static ArrayList<ProductForSale> list = new ArrayList<>();

    public static void main(String[] args) {

        Candy wormCandy = new Candy("Worm", 2.5, "A long and sour candy!");
        Candy colaCandy = new Candy("Cola", 1.5, "A cola shaped and sweet tasting candy!");
        OrderItem orderCola = new OrderItem(10, colaCandy);

        OrderItem orderWorms = new OrderItem(20, wormCandy);
        list.add(wormCandy);
        list.add(colaCandy);
        wormCandy.printItem(20);
        wormCandy.showDetails();
        printList();
    }

    public static void printList() {
        for (ProductForSale item :
                list) {
            item.showDetails();
        }
    }
}
