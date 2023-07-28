import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    record Person(String firstName, String lastName){
        @Override
        public String toString() {
            return firstName + " " + lastName;
        }
    }
    public static void main(String[] args) {

        List<Person> people = new ArrayList<>(Arrays.asList(
                new Person("Martin","Kirilov"),
                new Person("Raina","Purvanova"),
                new Person("Dimitur","Dimitrov"),
                new Person("Gospodin","Gospodinov"),
                new Person("Mihail","Cvetkov")
        ));

        var comapartorLastName = new Comparator<Person>(){

            @Override
            public int compare(Person person, Person t1) {
                return person.lastName.compareTo(t1.lastName);
            }
        };

        people.sort(comapartorLastName);

        System.out.println(people);
    }
}