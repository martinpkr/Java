package dev.lpa;

import java.util.ArrayList;

public class Bank {
    private String name;
    private ArrayList<Customer> customerList;

    public Bank(String name, ArrayList<Customer> customerList) {
        this.name = name;
        this.customerList = customerList;
    }

    public void addCustomer(Customer name) {
        var iterator = customerList.listIterator();
        while (iterator.hasNext()) {
            Customer customer = iterator.next();
            if (customerList.contains(customer)) {
                System.out.println("customer already in list");
            } else {
                customerList.add(customer);
            }
        }
    }

    public void addTransaction(Customer customer, double money) {
        var iterator = customerList.listIterator();
        while (iterator.hasNext()) {
            Customer person = iterator.next();
            if (customerList.contains(person)) {
                person.getList().add(money);
                System.out.println(customer + "added" + money + "to your transactions");
            }
        }
    }
}
