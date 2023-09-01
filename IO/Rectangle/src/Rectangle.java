public class Rectangle extends Figure {
    private double width;
    private double height;

    public Rectangle(double width, double height) {
        this.width = width;
        this.height = height;
    }

    public Rectangle() {
        this.width = 4;
        this.height = 4;
    }

    public void printArea() {
        System.out.println(width + height);
    }

    @Override
    void printParameter() {

    }

    public void printPerimeter() {
        System.out.println(width * height);
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    @Override
    void printArea(double width, double height) {

    }

    @Override
    void printParameter(double width, double height) {

    }
}
