package com.test.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpSession;

@Controller
public class DirectController {
    @RequestMapping("/tourist")
    public String tourist()throws Exception{
        return "touristMenu";
    }
    @RequestMapping("/employee")
    public String employee()throws Exception{
        return "employeeMenu";
    }
    @RequestMapping("/manager")
    public String manager()throws Exception{
        return "managerMenu";
    }
    @RequestMapping("/touristLogin")
    public String touristLogin()throws Exception{
        return "touristLogin";
    }
    @RequestMapping("/touristRegist")
    public String touristRegist()throws Exception{
        return "touristRegist";
    }
    @RequestMapping("/index1")
    public String index1()throws Exception{
        return "../../index1";
    }
    @RequestMapping("/touristResume")
    public String touristResume(int id,HttpSession session)throws Exception{
        session.setAttribute("recruitId",id);
        return "touristResume";
    }
}
