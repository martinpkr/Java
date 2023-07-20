import java.util.Scanner;

public class Order {
    private Burger burger;
    private Drink drink;
    private SideItem sideItem;

    public Order(){
        this(new Burger("burger",3.99),new Drink("cola","small",1.99), new SideItem("fries",2.99));
    }
    public Order(Burger burger, Drink drink, SideItem sideItem) {
        this.burger = burger;
        this.drink = drink;
        this.sideItem = sideItem;

    }
    public void changeDrinkSize(){
        System.out.println("With what size to replace your drink?");
        Scanner s = new Scanner(System.in);
        String changeInput = s.nextLine();
        if(changeInput.equals("big")){
            drink.setSize("big");
            drink.setPrice(2.5);
            System.out.println("Your drink was replaced by a big one");
        }else if(changeInput.equals("small")){
            drink.setSize("small");
            drink.setPrice(1);
            System.out.println("Your drink was replaced by a small one");
        }else if(changeInput.equals("medium")){
            drink.setSize("medium");
            drink.setPrice(1.5);
            System.out.println("Your drink was replaced by a medium one");
        }else{
            System.out.println("No such size!!!");
        }

    }
    public void printItems(){
        System.out.println(burger.getType() + " burger for: " + burger.getPrice() +
                " drink " + drink.getSize() + " size for: " + drink.getPrice() +
                " side item: " + sideItem.getType() + " for: " + sideItem.getPrice());
    }
    public void totalAmount(){
        System.out.println("The total amount of you'r order is: " + (burger.getPrice() + drink.getPrice() +
                sideItem.getPrice() ) );
    }
}

class Burger {
    private String type;
    private double price;


    public Burger(String type, double price) {
        this.type = type;
        this.price = price;
        addToppings();
    }


    public void addToppings(){


        for(int i = 0;i < 3;i++){

            System.out.println("choose toppings from 'mayonnaise','ketchup' and 'mustard', or say no to stop adding toppings ");
        Scanner s = new Scanner(System.in);
        String customerTopping = s.nextLine();
            switch (customerTopping) {
                case "mayonnaise" -> price += 1.25;
                case "ketchup" -> price += 2;
                case "mustard" -> price += 5;
                case "no" -> System.out.println("No more toppings");
            }
        }
    }

    public double getPrice() {
        return price;
    }

    public String getType() {
        return type;
    }

    public void setPrice(double price) {
        this.price = price;
    }
}

class Drink {
    private String type;
    private double price;
    private String size;

    public Drink(String type, String size, double price) {
        this.type = type;
        this.size = size;
        this.price = switch (size){
            case "big" -> 2.5;
            case "medium" -> 1.5;
            case "small" -> 1;
            default -> price;
        };

    }

    public String getSize() {
        return size;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public void setSize(String size) {
        this.size = size;
    }
}

class SideItem {
    private String type;
    private double price;

    public SideItem(String type, double price) {
        this.type = type;
        this.price = price;
    }

    public double getPrice() {
        return price;
    }

    public String getType() {
        return type;
    }
}