public abstract class Figure {

    abstract void printArea();
    abstract void printParameter();

    public void printFigure(){
        System.out.println(this.getClass().getSimpleName());
    }

    abstract void printArea(double width, double height);

    abstract void printParameter(double width, double height);
}
