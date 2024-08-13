public class MainBankAccount {
    public static void main(String[] args) {
        BankAccount bankAccount = new BankAccount();
        bankAccount.setName("John Doe");
        bankAccount.setAccountNumber(12345);
        bankAccount.setEmail("john@doe.com");
        bankAccount.setPhoneNumber("+2349812312");

        System.out.println("Name: " + bankAccount.getName());
        System.out.println("Account Number: " + bankAccount.getAccountNumber());
        System.out.println("Email: " + bankAccount.getEmail());
        System.out.println("Phone Number: " + bankAccount.getPhoneNumber());
        System.out.println("Balance: " + bankAccount.getBalance());

        bankAccount.depositMoney(1000.00);
        System.out.println("Balance: " + bankAccount.getBalance());
        System.out.println("Withdrawn 200 Euros: " + bankAccount.withdrawMoney(200.00));
        System.out.println("Balance: " + bankAccount.getBalance());
        System.out.println("Withdrawn 1200 Euros: " + bankAccount.withdrawMoney(1200.00));
        System.out.println("Balance: " + bankAccount.getBalance());

    }
}
