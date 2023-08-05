import java.nio.file.Path;
import java.nio.file.Paths;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {

        Path p1 = Paths.get("a/b/c");

        System.out.println(p1);
        System.out.println(p1.getClass());
    }
}