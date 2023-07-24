package dev.lpa;

import java.util.ArrayList;


public class MobilePhone {
    // write code here
    private final String myNumber;
    private ArrayList<Contact> myContacts;

    public MobilePhone(String phoneNumber) {
        this.myNumber = phoneNumber;
        this.myContacts = new ArrayList<>();
    }

    public boolean addNewContact(Contact contact){
        if(!myContacts.contains(contact)){
            myContacts.add(contact);
            return true;
        }
        return false;
    }
    public boolean updateContact(Contact oldContact,Contact newContact){
        if(myContacts.contains(oldContact)){
            myContacts.set(myContacts.indexOf(oldContact),newContact);
            return true;
        }
        return false;
    }
    public boolean removeContact(Contact contactToRemove){
        if(myContacts.contains(contactToRemove)) {
            myContacts.remove(contactToRemove);
            return true;
        }
        return false;
    }
    public int findContact(Contact contactToFind){
        return myContacts.indexOf(contactToFind);
    }
    public int findContact(String stringToFind){
        return myContacts.indexOf(stringToFind);
    }

    public Contact queryContact(String name){
        for (int i = 0; i < myContacts.size(); i++) {
            if(myContacts.get(i).getName().equals(name)){
                return myContacts.get(i);
            }
        }
        return null;
    }

    public void printContacts(){
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder = new StringBuilder("""
                 Contact List:
                """);
        for (int i = 0; i < myContacts.size(); i++) {
            stringBuilder.append(i).append(".").append(" ").append(myContacts.get(i).getName()).append(" -> ").append(myContacts.get(i).getPhoneNumber()).append("\n");
        }
        System.out.println(stringBuilder);
    }


}

