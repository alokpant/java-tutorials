public class Customer {
    private final double creditLimit;
    private final String name;
    private final String email;

    public Customer() {
        this("John Doe", "john.doe@gmail.com", 100.0);
    }

    public Customer(String name, String email) {
        this(name, email, 100.0);
    }

    public Customer(String name, String email, double creditLimit) {
        this.name = name;
        this.email = email;
        this.creditLimit = creditLimit;
    }

    @Override
    public String toString() {
        return "Customer{" +
                "creditLimit=" + creditLimit +
                ", name='" + name + '\'' +
                ", email='" + email + '\'' +
                '}';
    }
}
