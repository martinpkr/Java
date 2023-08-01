import dev.lpa.Contact;
import dev.lpa.ContactData;

import java.util.Collection;
import java.util.Collections;
import java.util.List;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {



            List<Contact> emails = ContactData.getData("email");
            List<Contact> phones = ContactData.getData("phone");
            printData("Phone List",phones);
        printData("Email List",emails);

        }

    public static void printData(String header, Collection<Contact> contacts) {
        System.out.println("----------------------");
        System.out.println(header);
        System.out.println("-----------------------");
        contacts.forEach(System.out::println);
    }

}