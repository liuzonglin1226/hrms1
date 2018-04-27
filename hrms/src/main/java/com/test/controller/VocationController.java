package com.test.controller;

import com.test.biz.VocationService;
import com.test.model.Vocation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpSession;
import java.util.List;

@Controller
public class VocationController {
    @Autowired
    private VocationService vocationService;
    @RequestMapping("/managerLookVocation")
    public String managerLookVocation(Vocation vocation, HttpSession session)throws Exception{
        List<Vocation> list=vocationService.selectVocationByManagementId(vocation.getV_managementid());
        session.setAttribute("managerLookVocation",list);
        session.setAttribute("managerLookVocationId",vocation.getV_managementid());
        return "managerLookVocation";
    }
    @RequestMapping("/managerDeleteVocation")
    public String managerDeleteVocation(Vocation vocation,HttpSession session)throws Exception{
        if(vocation.getV_num()==0){
            vocationService.deleteVocation(vocation);
        }
        List<Vocation> list=vocationService.selectVocationByManagementId((Integer) session.getAttribute("managerLookVocationId"));
        session.setAttribute("managerLookVocation",list);
        return "managerLookVocation";
    }
    @RequestMapping("/managerCreateVocation")
    public String managerCreateVocation(Vocation vocation,HttpSession session)throws Exception{
        vocation.setV_managementid((Integer) session.getAttribute("managerLookVocationId"));
        Vocation vocation1=vocationService.selectByNameAndManagementId(vocation);
        if(vocation1==null){
            if(vocation.getV_salary()<=3000.0){
                vocation.setV_salary(3000.0);
            }
            vocation.setV_num(0);
            vocationService.saveVocation(vocation);
        }
        List<Vocation> list=vocationService.selectVocationByManagementId(vocation.getV_managementid());
        session.setAttribute("managerLookVocation",list);
        return "managerLookVocation";
    }
}
