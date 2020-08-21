package escapingreferences;

public class Main {

	public static void main(String[] args) {
		CustomerRecords records = new CustomerRecords();

		records.addCustomer(new Customer("John"));
		records.addCustomer(new Customer("Simon"));

		for (Customer next : records.getCustomers().values()) {
			System.out.println(next);
		}
		System.out.println("Before clearing CustomerRecords are " + records.getCustomers());

		// Direct referencing is problem
		records.getCustomers().clear();
		System.out.println("After clearing CustomerRecords are" + records.getCustomers());
	}
}
