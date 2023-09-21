package dev.lpa;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<Contact> contacts = new ArrayList<>();
        Contact mySibling = new Contact("Preslav", "089352354");
        Contact myUncle = new Contact("chihco kalincho", "232423532");
        Contact teacher = new Contact("Math teacher", "082342934");
        Contact newTeacher = new Contact("Chem teacher", "99982342934");

        MobilePhone mobilePhone = new MobilePhone("1234567334");

        mobilePhone.addNewContact(myUncle);
        mobilePhone.addNewContact(mySibling);
        mobilePhone.addNewContact(teacher);
        System.out.println(mobilePhone.findContact(myUncle));
        mobilePhone.updateContact(teacher, newTeacher);
        System.out.println(mobilePhone.updateContact(teacher, newTeacher));


        mobilePhone.printContacts();
    }
}
