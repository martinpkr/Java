package dev.lpa;

public class Candy extends ProductForSale {

    public Candy(String type, double price, String description) {
        super(type, price, description);
    }

    @Override
    public void showDetails() {
        System.out.println(type + " " + type.getClass().getSimpleName() + " will cost you " +
                price + " they are " + description);
    }


}
