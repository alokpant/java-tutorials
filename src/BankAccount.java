public class BankAccount {
    private int accountNumber;
    private double balance = 0.0;
    private String name;
    private String email;
    private String phoneNumber;

    // All fields getters and setters
    // 1. Account Number
    public int getAccountNumber() {
        return this.accountNumber;
    }

    public void setAccountNumber(int accountNumber) {
        this.accountNumber = accountNumber;
    }

    // 2. Balance
    public double getBalance() {
        return this.balance;
    }

    public void depositMoney(double balance) {
        this.balance += balance;
    }

    public double withdrawMoney(double balance) {
        if (balance > this.balance) {
            System.out.println("Not enough balance");
            return this.balance;
        }

        if (balance < 0) {
            System.out.println("Invalid balance");
            return this.balance;
        }

        this.balance -= balance;

        return this.balance;
    }

    // 3. name
    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    // 4. email
    public String getEmail() {
        return this.email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    // 5. phone number
    public String getPhoneNumber() {
        return this.phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }
}
