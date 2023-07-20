// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
//        Burger bigMac = new Burger("Big Mac",5.59);
        Drink cola = new Drink("cola","big",2.99);
        SideItem fries = new SideItem("french fries",3.29);
//        Order basicOrder = new Order();
        Order bigMacOrder = new Order(new Burger("Big-Mac",4.99),new Drink("Pepsi","small",2.99),new SideItem("fallafel",0.50));

//        bigMacOrder.printItems();
//        bigMacOrder.changeDrinkSize();
        bigMacOrder.printItems();
        bigMacOrder.totalAmount();
    }
}