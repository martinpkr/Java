// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        Printer xerox = new Printer(50,false);
        xerox.addToner(20);
        xerox.printPages(40);
        xerox.printPages(80);

    }
}