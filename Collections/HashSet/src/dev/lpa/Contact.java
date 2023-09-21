package dev.lpa;

import java.util.HashSet;
import java.util.Set;

public class Contact {
    Set<String> emails = new HashSet<>();
    Set<String> phones = new HashSet<>();
    private String name;

    public Contact(String name) {
        this(name, null);
    }

    public Contact(String name, String email) {
        this(name, email, 0);
    }

    public Contact(String name, long phone) {
        this(name, null, phone);
    }

    public Contact(String name, String email, long phone) {

        this.name = name;
        if (!(email == null)) {
            emails.add(email);
        }
        if (phone != 0) {
            String wholeString = Long.toString(phone);
            String firstThree = wholeString.substring(0, 3);
            String middle = wholeString.substring(3, 6);
            String last = wholeString.substring(6, 10);

            String reforamattedPhone = String.format("(%s) %s-%s", firstThree, middle, last);
            phones.add(reforamattedPhone);
        }
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "Contact{" +
                "name='" + name + '\'' +
                ", emails=" + emails +
                ", phones=" + phones +
                '}';
    }

    public Contact mergeContactDate(Contact contact) {
        Contact newContact = new Contact(name);
        newContact.emails = new HashSet<>(this.emails);
        newContact.phones = new HashSet<>(this.phones);
        newContact.emails.addAll(contact.emails);
        newContact.phones.addAll(contact.phones);
        return newContact;

    }
}
