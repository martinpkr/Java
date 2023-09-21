public class Square extends Figure {
    private double width;
    private double height;

    public Square(double width, double height) {
        this.width = width;
        this.height = height;
    }

    @Override
    void printArea() {

    }

    @Override
    void printParameter() {

    }

    @Override
    void printArea(double width, double height) {
        System.out.println("area is: " + width * height);
    }

    @Override
    void printParameter(double width, double height) {
        System.out.println("parameter is: " + height * 4);
    }
}
