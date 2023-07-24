package dev.lpa;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

    ArrayList<String> groceryList = new ArrayList<String>();
    groceryList.add("bananas");
    groceryList.add("grapes");
    groceryList.add("apples");

    promptUser(groceryList);


    }

    public static void promptUser(ArrayList<String> groceryList){
        System.out.println("Type 0 to exit the program, 1 to add items and 2 to delete items");
        Scanner s = new Scanner(System.in);
        String choice = s.nextLine();

        switch (choice){
            case "0" -> {
                System.out.println("Quit program!");
                System.out.println(groceryList);
                return;
            }
            case "1" -> {
                System.out.println("What items do you want to add to your cart");
                Scanner insideS = new Scanner(System.in);
                String listString = insideS.nextLine();
                String[] arrayOfStrings = listString.split(",");
                ArrayList<String> arraylist = new ArrayList<String>(Arrays.asList(arrayOfStrings));
                groceryList.addAll(arraylist);
                System.out.println(groceryList);
            }
            case "2" -> {
                System.out.println("What items do you want to remove from your cart");
                Scanner insideS = new Scanner(System.in);
                String listString = insideS.nextLine();
                String[] arrayOfStrings = listString.split(",");
                ArrayList<String> removelist = new ArrayList<String>(Arrays.asList(arrayOfStrings));
                groceryList.removeAll(removelist);
                System.out.println(groceryList);


            }
        }
    }

}
