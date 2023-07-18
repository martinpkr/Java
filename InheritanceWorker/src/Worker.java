public class Worker {
    protected String name;
    private String birthDay;
    protected String endDate;

    public Worker(String name, String birthDay, String endDate) {
        this.name = name;
        this.birthDay = birthDay;
        this.endDate = endDate;
    }

    public int getAge(){
        int currentYear = 2023;
        int workerBirthdayYear = Integer.parseInt(this.birthDay.substring(6));
        System.out.println(currentYear - workerBirthdayYear);
        return currentYear - workerBirthdayYear;
    }

    public double collectPay(){
        double salary = 2000.00;
        System.out.println(this.name + " has collected his salary of " + salary);
        return salary;
    }

    public void terminate(String endDate){
        if(endDate == this.endDate){
            System.out.println("we are going to terminate " + this.name + "  because the contract has ran off");
        }else{
            System.out.println(this.name + " is currently employed!");
        }
    }

}
