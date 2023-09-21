public class DeluxeBurger extends Burger {
    public DeluxeBurger() {
        this("Deluxe Burger", 20);
    }

    public DeluxeBurger(String type, double price) {
        super(type, price);
        price = 20;
        type = "Deluxe Burger";
    }
}
