public class FirstClass {
    public static void main(String[] args) {
        double firstNumValue = 20.00d;
        double secondNumValue = 80.00d;
        double result = (firstNumValue + secondNumValue) * 100.00d;
        double remainder = result % 40.00d;
        boolean IsZero = false;
        if(remainder == 0) {
            IsZero = true;
        }else{
            System.out.println("Got some remainder");
        }
        System.out.println(remainder);


    }
}
