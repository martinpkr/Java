import java.util.*;

public class Main {
    public static void main(String[] args) {
        int number = 10;
        List<Integer> list = new ArrayList<>();
        Random rand = new Random();
        list.add(10);
        for (int i = 0; i < 100;i++){

            list.add(rand.nextInt(2000));

        }
        Comparator<Integer> comparator = new Comparator<Integer>() {
            @Override
            public int compare(Integer integer, Integer t1) {
                return integer.compareTo(t1);
            }
        };

        list.sort(comparator);

        if((list.size() / 2) % 2 == 0){

            int middle = list.size() / 2;

            if (list.indexOf(middle) == number){
                System.out.println("found number: " + number);
            }
            int target = 0;
            int iterations = 0;
            while(target != number){
                iterations += 1;
                if(list.get(list.size() / 2) == number){
                    System.out.println("Number found: " + number + " after " + iterations + " loops");
                    target = number;
                    return;
                }
                list = list.subList(0,list.size() / 2);
                System.out.println(list);

            }
        }

    }
}
