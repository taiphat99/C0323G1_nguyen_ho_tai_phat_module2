package furama_resort_management.repository.person;

import furama_resort_management.model.person.impl.Customer;

import java.util.List;

public interface ICustomerRepository {
    List<Customer> getAll();
    void add(Customer customer);
    void remove(Customer customer);
    List<Customer> findByName(String name);
    Customer findById(String id);
    String getInfo(Customer customer);
    void updateCustomer(Customer customer);
}
