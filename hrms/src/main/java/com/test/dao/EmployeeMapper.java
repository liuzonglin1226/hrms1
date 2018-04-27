package com.test.dao;

import com.test.model.Employee;

import java.util.List;

public interface EmployeeMapper {
    void saveEmployee(Employee employee);
    void deleteEmployee(Employee employee);
    void updateEmployee(Employee employee);
    List<Employee> selectByVocationId(Employee employee);
    Employee selectByName(Employee employee);
    Employee selectByNameAndPass(Employee employee);
}
