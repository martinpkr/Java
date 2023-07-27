import dev.lpa.Plant;
import dev.lpa.PlantExaminer;
import dev.lpa.Rose;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        PlantExaminer plantExaminer = new PlantExaminer<>(new Plant("cvetence","Red",false));
        plantExaminer.examine();
        Rose rose = new Rose("rozichko","Pink",false,"very good");
        PlantExaminer plantExaminer1 = new PlantExaminer<>(new Rose("rozicho","Pink",false,"amazing"));
        plantExaminer1.examine();
        rose.printSmell();

        PlantExaminer<String> plantExaminer2 = new PlantExaminer<>("StringInstance");
        plantExaminer2.examine();
    }
}