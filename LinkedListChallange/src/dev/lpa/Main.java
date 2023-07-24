package dev.lpa;

import java.util.*;

public class Main {
    public static void main(String[] args) {

        Place place1 = Place.getPlace("Adelaide", 1374);
        Place place2 = Place.getPlace("Alice Spring", 2771);
        Place place3 = Place.getPlace("Brisbane", 917);
        Place place4 = Place.getPlace("Darwin", 3972);
        Place place5 = Place.getPlace("Melbourne", 877);

        LinkedList<Place> linkedList = new LinkedList<>();
        linkedList.addAll(Arrays.asList(place1, place2,place3,place4,place5));

        linkedList.sort(new Comparator<Place>() {
            @Override
            public int compare(Place place, Place t1) {
                return place.getDistance() - t1.getDistance();
            }
        });
        var iterator = linkedList.listIterator();
        promptUser(true,linkedList,iterator);

    }
    public static void moveForward(ListIterator<Place> iterator){

        if(iterator.hasNext()){
            System.out.println(iterator.next());
        }else{
            System.out.println("cant go anymore forward");
        }
    }
    public static void moveBackwards(ListIterator<Place> iterator){
        if(iterator.hasPrevious()){
            System.out.println(iterator.previous());
        }else{
            System.out.println("cant go anymore backwards");
        }
    }
    public static void listPlaces(LinkedList<Place> linkedList){
        for (Place place:
             linkedList) {
            System.out.println(place);

        }

    }
    public static void promptUser(boolean flag, LinkedList<Place> linkedList, ListIterator<Place> iterator){
        showMenu();
        while (flag){

            Scanner s = new Scanner(System.in);
            String userChoise = s.nextLine();
            String finalInput = userChoise.toUpperCase();

            if(finalInput.equals("F")){
                moveForward(iterator);
            } else if (finalInput.equals("B")) {
                moveBackwards(iterator);
            } else if (finalInput.equals("Q")) {
                flag = false;
            }else if(finalInput.equals("M")){
                showMenu();
            }else if(finalInput.equals("L")){
                listPlaces(linkedList);
            }
        }
    }
    public static void showMenu(){
        String stringBuilder = """
                 Available actions, select word or letter:\s
                (F)orward
                (B)ackwards
                (L)ist Print
                (M)enu
                (Q)uit""";
        System.out.println(stringBuilder);
    }


}
