public class Dog extends Animal {
    private String tailType;
    private String earType;

    public Dog() {
        super("Terier", "Big", 23);
    }

    public Dog(String type, String size, double weight, String tailType, String earType) {
        super(type, size, weight);
        this.tailType = tailType;
        this.earType = earType;
    }

    public void windTail() {
        System.out.println(type + "doge " + tailType + " with " + earType + " tail is happy");
    }

    @Override
    public void move(String speed) {
        super.move(speed);
        if (speed == "fast") {
            tailType = "Swinger";
            windTail();
        }
    }
}
