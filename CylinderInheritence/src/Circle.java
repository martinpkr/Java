public class Circle {
    private double radius;

    public Circle(double radius){
        if(radius < 0){
            radius = 0;
        }
        this.radius = radius;
    }

    public double getRadius(){
        return this.radius;
    }

    public double getArea(){
        return radius * radius * Math.PI;
    }

}

class Cylinder extends Circle{

    private double height;

    public Cylinder(double radius, double height) {
        super(radius);
        if(height < 0){
            height = 0;
        }
        this.height = height;
    }

    public double getHeight(){
        return this.height;
    }
    public double getVolume(){
        return getArea() * height;
    }
}
