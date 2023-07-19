public class Printer {
    private int tonerLevel;
    private int pagesPrinted;
    private boolean duplex;

    public Printer(int tonerLevel, boolean duplex) {
        this.tonerLevel = tonerLevel;
        this.duplex = duplex;
    }

    public int addToner(int tonerAmount){
        if (tonerAmount + tonerLevel > 100){
            return -1;
        }
        tonerLevel += tonerAmount;
        System.out.println("Toner level is currently at: " + tonerLevel +
                " added amount = " + tonerAmount);
        return tonerLevel;

    }

    public void printPages(int pages){
        pagesPrinted += pages;
        if(duplex){
            System.out.println("The printer will use " + pages / 2 + " sheets of paper");
            System.out.println("using a duplex setting");
        }else{
            System.out.println("The printer will use " + pages  + " sheets of paper");

        }
    }
}
