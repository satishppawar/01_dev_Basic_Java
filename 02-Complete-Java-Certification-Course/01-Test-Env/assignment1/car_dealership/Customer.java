package assignment1.car_dealership;

 

public class Customer {

	private String name;
	private String address;
	private double cashonHand;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public double getCashonHand() {
		return cashonHand;
	}

	public void setCashonHand(double cashonHand) {
		this.cashonHand = cashonHand;
	}

	public void purchaseCar(Vehicle vehicle, Employee emp, boolean finance) {
		emp.handleCustomer(this, finance, vehicle);
	}

	@Override
	public String toString() {
		return "Customer [name=" + name + ", address=" + address + ", cashonHand=" + cashonHand + "]";
	}
	
	

}
