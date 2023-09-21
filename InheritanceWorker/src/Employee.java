public class Employee extends Worker {
    private static int employeeNo = 1;
    private long employeeId;
    private String hireDate;

    public Employee(String name, String birthDay, String endDate, String hireDate) {
        super(name, birthDay, endDate);
        this.employeeId = Employee.employeeNo++;
        this.hireDate = hireDate;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "employeeId=" + employeeId +
                ", hireDate='" + hireDate + '\'' +
                ", name='" + name + '\'' +
                ", endDate='" + endDate + '\'' +
                '}';
    }
}

class HourlyEmployee extends Employee {
    private double hourlyPayRate;

    public HourlyEmployee(String name, String birthDay, String endDate, long employeeId, String hireDate, double hourlyPayRate) {
        super(name, birthDay, endDate, hireDate);
        this.hourlyPayRate = hourlyPayRate;
    }

    public void getDoublePay() {
        double doublePay = hourlyPayRate * 2;
        System.out.println(name + "is getting paid double the amount of: " + hourlyPayRate + "that equals to: " + doublePay);
    }

    @Override
    public String toString() {
        return "HourlyEmployee{" +
                "hourlyPayRate=" + hourlyPayRate +
                ", name='" + name + '\'' +
                ", endDate='" + endDate + '\'' +
                '}';
    }
}
