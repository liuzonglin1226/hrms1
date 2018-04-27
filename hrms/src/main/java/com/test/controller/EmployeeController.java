package com.test.controller;

import com.test.biz.*;
import com.test.model.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpSession;
import java.util.List;

@Controller
public class EmployeeController {
    @Autowired
    private EmployeeService employeeService;
    @Autowired
    private ResumeService resumeService;
    @Autowired
    private VocationService vocationService;
    @Autowired
    private RecruitService recruitService;
    @Autowired
    private ManagementService managementService;
    @RequestMapping("/managerEmploy")
    public String managerEmploy(Resume resume, HttpSession session)throws Exception{
        resume.setRe_receive("用户已被录用");
        resumeService.updateResume(resume);
        Recruit recruit=recruitService.selectById(resume.getRe_recruitid());
        recruit.setR_num(recruit.getR_num()-1);
        recruitService.updateRecruit(recruit);
        Employee employee=new Employee();
        employee.setE_name(resume.getRe_phone());
        Employee employee1=employeeService.selectByName(employee);
        if(employee1!=null){
            employee.setE_name(resume.getRe_phone()+"1");
        }
        Vocation vocation=new Vocation();
        vocation.setV_name(resume.getRe_vocation());
        Vocation vocation1=vocationService.selectByName(vocation);
        vocation1.setV_num(vocation1.getV_num()+1);
        vocationService.updateVocation(vocation1);
        employee.setE_namer(resume.getRe_name());
        employee.setE_age(resume.getRe_age());
        employee.setE_phone(resume.getRe_phone());
        employee.setE_address(resume.getRe_address());
        employee.setE_managementid(vocation1.getV_managementid());
        employee.setE_vocationid(vocation1.getV_id());
        employee.setE_pass("123");
        employeeService.saveEmployee(employee);
        Management management=new Management();
        management.setMa_id(vocation1.getV_managementid());
        Management management1=managementService.selectById(management);
        management1.setMa_num(management1.getMa_num()+1);
        managementService.updateManagement(management1);
        List<Resume> list=resumeService.getResume();
        session.setAttribute("managerLookResume",list);
        return "managerLookResume";
    }
    @RequestMapping("/employeeLogin1")
    public String employeeLogin1(Employee employee)throws Exception{
        Employee employee1=employeeService.selectByNameAndPass(employee);
        if(employee1!=null){
            return "employeeMainMenu";
        }
        return "employeeLogin";
    }
    @RequestMapping("/managerLookEmployee")
    public String managerLookEmployee(Vocation vocation,HttpSession session)throws Exception{
        Employee employee=new Employee();
        employee.setE_vocationid(vocation.getV_id());
        List<Employee> list=employeeService.selectByVocationId(employee);
        session.setAttribute("vocationid",vocation.getV_id());
        session.setAttribute("employeeList",list);
        return "managerLookEmployee";
    }
}
