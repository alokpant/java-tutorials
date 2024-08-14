public class MainCustomer {
    public static void main(String[] args) {
        for (int i = 0; i <= 4; i++) {
            RecordCustomer customer = new RecordCustomer(
                    "Mark Doe " + i,
                    "mark@gmail.com",
                    100000.05);
            System.out.println(customer.toString());
        }

//
//        customer = new Customer("Jane Doe", "jane.doe@gmail.com");
//        System.out.println(customer.toString());
//
//        customer = new Customer("Mark Doe", "mark@gmail.com", 100000.05);
//        System.out.println(customer.toString());
    }
}
