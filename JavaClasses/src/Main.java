// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        // Press Alt+Enter with your caret at the highlighted text to see how

//        BankAccount myBankAcc = new BankAccount("12345",1000,"Delqn Genkov",
//                "delqn@abv.bg","08954544543");
//        myBankAcc.deposit(250);
//        System.out.println(myBankAcc.getBalance());
//        System.out.println(myBankAcc.getEmail());
//        System.out.println(myBankAcc.getPhone());
//
//        myBankAcc.withdraw(263);

        Customer john = new Customer("Dimitrina", 500000, "rich@abv.bg");
        System.out.println(john.getName());
        System.out.println(john.getCreditLimit());

        System.out.println(john);
        Point point = new Point(6, 2);
        System.out.println(point.distance());

    }
}