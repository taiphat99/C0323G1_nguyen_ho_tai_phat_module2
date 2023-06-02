package furama_resort_management.repository.person;

import furama_resort_management.model.person.impl.Employee;

import java.util.List;

public interface IEmployeeRepository {
    void remove(Employee employee);
    List<Employee> getAll();
    void add(Employee employee);
    Employee findById(String id);
    List<Employee> findByName(String name);
    String getInfo(Employee employee);
    void updateEmployee(Employee employee);
}
