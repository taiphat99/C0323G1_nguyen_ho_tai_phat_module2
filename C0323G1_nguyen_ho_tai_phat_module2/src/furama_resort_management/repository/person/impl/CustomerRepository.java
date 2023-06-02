package furama_resort_management.repository.person.impl;

import furama_resort_management.common.manipulate_file.ManipulateFile;
import furama_resort_management.model.person.impl.Customer;
import furama_resort_management.repository.person.ICustomerRepository;

import java.util.ArrayList;
import java.util.List;

public class CustomerRepository implements ICustomerRepository {
    private static final String CUSTOMER_PATH = "src/furama_resort_management/data/Customer.csv";
    private static List<Customer> customerList = new ArrayList<>();
    private static List<String> customerStringList = new ArrayList<>();

    @Override
    public List<Customer> getAll() {
        customerList.clear();
        customerStringList = ManipulateFile.readFromFile(CUSTOMER_PATH);
        for (String s : customerStringList) {
            String[] array = s.split(",");
            customerList.add(new Customer(array[0], array[1], array[2], Boolean.parseBoolean(array[3]), array[4], array[5], array[6], array[7], array[8]));
        }
        return customerList;
    }

    @Override
    public void add(Customer customer) {
        customerList = getAll();
        customerStringList.clear();
        customerList.add(customer);
        customerStringList.add(getInfo(customer));
        ManipulateFile.writeToFile(CUSTOMER_PATH, customerStringList, true);
    }

    @Override
    public void remove(Customer customer) {
        customerList = getAll();
        customerStringList.clear();
        customerList.remove(customer);
        for (Customer c : customerList) {
            customerStringList.add(getInfo(c));
        }
        ManipulateFile.writeToFile(CUSTOMER_PATH, customerStringList, false);
    }

    @Override
    public List<Customer> findByName(String name) {
        List<Customer> findingList = new ArrayList<>();
        customerList = getAll();
        for (Customer c : customerList) {
            if (c.getName().toLowerCase().contains(name.toLowerCase())) {
                findingList.add(c);
            }
        }
        return findingList;
    }

    @Override
    public Customer findById(String id) {
        customerList = getAll();
        for (Customer c : customerList) {
            if (c.getId().equals(id)) {
                return c;
            }
        }
        return null;
    }

    @Override
    public String getInfo(Customer customer) {
        return customer.getId() + "," + customer.getName() + "," + customer.getDateOfBirth() + "," + customer.isGender() + "," + customer.getIdentityId() + "," + customer.getPhoneNumber() + "," + customer.getEmail() + "," + customer.getRank() + "," + customer.getAddress();
    }

    @Override
    public void updateCustomer(Customer customer) {
        customerList = getAll();
        customerStringList.clear();
        for (Customer c : customerList) {
            if (c.getId().equals(customer.getId())) {
                c.setName(customer.getName());
                c.setDateOfBirth(customer.getDateOfBirth());
                c.setGender(customer.isGender());
                c.setIdentityId(customer.getIdentityId());
                c.setPhoneNumber(customer.getPhoneNumber());
                c.setEmail(customer.getEmail());
                c.setRank(customer.getRank());
                c.setAddress(customer.getAddress());
            }
        }
        for (Customer c : customerList) {
            customerStringList.add(getInfo(c));
        }
        ManipulateFile.writeToFile(CUSTOMER_PATH, customerStringList, false);
    }
}
