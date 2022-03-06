package academy.digitallab.store.customer.service;



import academy.digitallab.store.customer.domain.Customer;
import academy.digitallab.store.customer.domain.Region;

import java.util.List;

public interface CustomerService {
     //segunda linea agregada
    public List<Customer> findCustomerAll();
    public List<Customer> findCustomersByRegion(Region region);
    //segunda linea agregada
    public Customer createCustomer(Customer customer);
    public Customer updateCustomer(Customer customer);
    public Customer deleteCustomer(Customer customer);
    public  Customer getCustomer(Long id);



}
