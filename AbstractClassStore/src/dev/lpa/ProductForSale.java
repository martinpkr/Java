package dev.lpa;

public abstract class ProductForSale {
    protected String type;
    protected double price;
    protected String description;

    public ProductForSale(String type, double price, String description) {
        this.type = type;
        this.price = price;
        this.description = description;
    }

    public double quantitySum(int quantity){
        return quantity * price;
    }
    public void printItem(int quantity){
        System.out.println("You bought " + quantity + " of " + type  + " at cost: " + quantitySum(quantity));
    }
    public abstract void showDetails();

}
