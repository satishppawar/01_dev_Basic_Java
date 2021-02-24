package assignment1.car_dealership;

public class Employee {

	public void handleCustomer(Customer customer, boolean finance, Vehicle vehicle) {
		if (finance) {
			double loanAmount = vehicle.getPrice() - customer.getCashonHand();
			runCreditHistory(customer, loanAmount);
		} else if (vehicle.getPrice() <= customer.getCashonHand()) {
			processTransaction(customer, vehicle);
		} else {
			System.out.println("Customer:: " + customer + " will need more money to purchase vehicle:: " + vehicle);
		}
	}

	private void processTransaction(Customer customer, Vehicle vehicle) {
		System.out.println("Customer " + customer + " has purchased the Vehicle: " + vehicle + " for the price "
				+ vehicle.getPrice());

	}

	private void runCreditHistory(Customer customer, double loanAmount) {
		System.out.println("Ran credit history for customer" + customer);
		System.out.println("Loan has been approved for customer");
	}

}
