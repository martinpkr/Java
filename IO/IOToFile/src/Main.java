import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) throws IOException {
        File file = new File("resources/textfile.txt");
        int counter = 0;
        try (Scanner scanner = new Scanner(new FileReader(file))) {
            while (scanner.hasNext()){

                int chars = scanner.next().length();
                counter += count(chars);
            }
        }
        FileWriter writer = null;
        try{
            writer = new FileWriter("resources/countfile.txt");
            writer.append(Integer.toString(counter));

        }catch (IOException e){
            System.out.println(e);
            e.printStackTrace();
        }finally {
            if (writer != null) {
                writer.close();
            }
        }
    }


    public static int count(int n){
        return n + 1;
    }

}