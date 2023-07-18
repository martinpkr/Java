public class Main {
    public static void main(String[] args) {
        Worker worker1 = new Worker("Martin", "16/10/2001", "05/10/2025");
        System.out.println(worker1.getAge());
        worker1.terminate("05/10/2023");
        worker1.collectPay();
        HourlyEmployee hourlyEmployee1 = new HourlyEmployee("Pesho",
                "24/03/2000",
                "10/12/2026"
                , 224455, "10/10/2024", 20);

        hourlyEmployee1.getDoublePay();
        hourlyEmployee1.collectPay();
        hourlyEmployee1.getAge();
        System.out.println(hourlyEmployee1);
        Employee employee2 = new Employee("Kolio","22/01/1993","21/02/2029","10/06/2022");
        System.out.println(employee2);

    }
}
