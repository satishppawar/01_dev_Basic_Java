package assignment1.car_dealership;



public class Dealership {
	public static void main(String[] args) {

		Customer customer1=new Customer();
		customer1.setName("Satish");
		customer1.setAddress("Dehli");
		customer1.setCashonHand(10000);
		
		Vehicle vehicle=new Vehicle();
		vehicle.setMake("honda");
		vehicle.setModel("Unicorn");
		vehicle.setPrice(15000);
		Employee emp=new Employee();
		customer1.purchaseCar(vehicle, emp, false);
		
		
		/***
		 * handleCustomer(Customer cust, boolean finance, Vehicle vehicle)
		 * {
		 * 		if(finance==true)
		 * 				runCreditHistory(Customer cust,double amount)
		 * 		else if(vehicle.getPrice()<=cust.cashOnHand)
		 * 				processTransaction(Customer cust,Vehicle vehicle)
		 * 
		 * 		else:
		 * 				tell customer to bring more money
		 * }
		 */
	}
}
