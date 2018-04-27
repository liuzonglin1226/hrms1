package com.test.biz.Impl;

import com.test.biz.EmployeeService;
import com.test.dao.EmployeeMapper;
import com.test.model.Employee;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class EmployeeServiceImpl implements EmployeeService {
    @Autowired
    private EmployeeMapper employeeMapper;
    @Override
    public void saveEmployee(Employee employee) {
        employeeMapper.saveEmployee(employee);
    }

    @Override
    public void deleteEmployee(Employee employee) {
        employeeMapper.deleteEmployee(employee);
    }

    @Override
    public void updateEmployee(Employee employee) {
        employeeMapper.updateEmployee(employee);
    }

    @Override
    public List<Employee> selectByVocationId(Employee employee) {
        return employeeMapper.selectByVocationId(employee);
    }

    @Override
    public Employee selectByName(Employee employee) {
        return employeeMapper.selectByName(employee);
    }

    @Override
    public Employee selectByNameAndPass(Employee employee) {
        return employeeMapper.selectByNameAndPass(employee);
    }
}
