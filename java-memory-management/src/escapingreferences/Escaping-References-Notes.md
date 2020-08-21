## Escaping-References-Notes

### STEP1:  CustomerRecords can be modified by anyone directly 
Refer the following classes


* Customer.java

	package escapingreferences;
	public class Customer {
		private String name;
	
		public String getName() {
			return name;
		}
	
		public Customer(String name) {
			this.name = name;
		}
	
		public String toString() {
			return name;
		}
	
	}
	
----
* CustomerRecords


	package escapingreferences;
	
	import java.util.HashMap;
	import java.util.Map;
	
	public class CustomerRecords {
		private Map<String, Customer> records;
	
		public CustomerRecords() {
			this.records = new HashMap<String, Customer>();
		}
	
		public void addCustomer(Customer c) {
			this.records.put(c.getName(), c);
		}
	
		public Map<String, Customer> getCustomers() {
			return this.records;
		}
	}

----

* Main.java

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

----

## Solution 1 : 

	