package naveenautomationlabs.lombok;

public class CustomerTest {

	public static void main(String[] args) {
		CustomerData customer = new CustomerData();
		customer.setName("nisar");
		customer.setAge(28);
		customer.setPercentage(73.4);
		customer.setActive(false);

		System.out.println(customer);
	}

}
