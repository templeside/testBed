package methodreferences;

public class CustomerMapper {
	public static CustomerBO convert(Customer customer) {
		CustomerBO cb = new CustomerBO();
		cb.setId(customer.getId());
		cb.setName(customer.getName());
		cb.setEmail(customer.getEmail());
		cb.setMobileNo(customer.getMobileNo());
		return cb;
	}
	
	public CustomerBO convert1(Customer customer) {
		CustomerBO cb = new CustomerBO();
		cb.setId(customer.getId());
		cb.setName(customer.getName());
		cb.setEmail(customer.getEmail());
		cb.setMobileNo(customer.getMobileNo());
		return cb;
	}
}
