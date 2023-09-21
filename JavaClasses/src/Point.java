public class Point {

    // write your code here
    private int x;
    private int y;

    public Point() {

    }

    public Point(int x, int y) {
        this.x = x;
        this.y = y;

    }

    public int getX() {
        return this.x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return this.y;
    }

    public void setY(int y) {
        this.y = y;
    }

    public double distance() {
        double dist = Math.sqrt(0 - this.x) * (0 - this.x) + (0 - this.y) * (0 - this.y);
        return dist;
    }

}
