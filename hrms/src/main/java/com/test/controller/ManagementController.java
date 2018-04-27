package com.test.controller;

import com.test.biz.ManagementService;
import com.test.biz.ResumeService;
import com.test.model.Management;
import com.test.model.Resume;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpSession;
import java.security.Principal;
import java.util.List;

@Controller
public class ManagementController {
    @Autowired
    private ManagementService managementService;
    @Autowired
    private ResumeService resumeService;
    @RequestMapping("/managerLookManagement")
    public String managerLookManagement(HttpSession session)throws Exception{
        List<Management> list=managementService.selectManagement();
        session.setAttribute("managerLookManagement",list);
        return "managerLookManagement";
    }
    @RequestMapping("/managerCreateManagement")
    public String managerCreateManagement(Management management,HttpSession session)throws Exception{
        Management management1=managementService.selectByName(management);
        if(management1==null){
            management.setMa_num(0);
            managementService.saveManagement(management);
        }
        List<Management> list=managementService.selectManagement();
        session.setAttribute("managerLookManagement",list);
        return "managerLookManagement";
    }
    @RequestMapping("/managerDeleteManagement")
    public String managerDeleteManagement(Management management,HttpSession session)throws Exception{
        if(management.getMa_num()==0){
            managementService.deleteManagement(management);
        }
        List<Management> list=managementService.selectManagement();
        session.setAttribute("managerLookManagement",list);
        return "managerLookManagement";
    }
    @RequestMapping("/managerInvite")
    public String managerInvite(Resume resume,HttpSession session)throws Exception{
        session.setAttribute("touristId1",resume.getRe_touristid());
        session.setAttribute("resumeId",resume.getRe_id());
        resume.setRe_receive("等待用户面试");
        resumeService.updateResume(resume);
        return "managerInvite";
    }
}
