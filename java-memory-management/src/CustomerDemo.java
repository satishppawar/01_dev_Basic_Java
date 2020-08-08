import memory.java.model.Customer;

public class CustomerDemo {
	public static void main(String[] args) {
		Customer customer = new Customer("Satish");
		System.out.println("Before rename customer is : " + customer.getName());
		renameCustomer(customer);
		System.out.println("After rename customer is : " + customer.getName());
	}

	private static void renameCustomer(Customer customer) {
		customer.setName("Mahesh");

	}
}
