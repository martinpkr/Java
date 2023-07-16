public class BankAccount {

    private String accountNumber;
    private int balance;
    private String name;
    private String email;
    private String phone;

    public String getAccountNumber() {
        return accountNumber;
    }

    public int getBalance() {
        return balance;
    }

    public String getName() {
        return name;
    }

    public String getEmail() {
        return email;
    }

    public String getPhone() {
        return phone;
    }

    public void setAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
    }

    public void setBalance(int balance) {
        this.balance = balance;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public void deposit(int number){
        this.balance += number;
        System.out.println("You deposited " + number);
    }
    public void withdraw(int number){
        if(this.balance >= number){
            this.balance -= number;
            System.out.println("You withdrawed " + number + " and are left with: " + getBalance());
        }else{
            System.out.println("Not enough balance");
        }

    }
}
