import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {

        List<String> list = new ArrayList<>(List.of("Triceratops","T-Rex","Flyrex"));

        var listStream = list.stream()
                .filter(s -> s.charAt(0) == 'T')
                .map(s -> s.toUpperCase())
                .sorted(Comparator.naturalOrder());



        var strings = Stream.of("One","Two","Three");
        var StreamStrings = strings.filter(s -> s.charAt(0) == 'T')
                .map(s -> s.toUpperCase())
                .sorted(Comparator.naturalOrder())


        Stream.concat(StreamStrings,listStream).forEach(System.out::println);


//        Stream.concat(strings,listStream).forEach(System.out::println);
    }
}