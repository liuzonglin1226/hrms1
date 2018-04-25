package com.test.controller;

import com.test.biz.InvitationService;
import com.test.biz.ManagerService;
import com.test.biz.RecruitService;
import com.test.biz.ResumeService;
import com.test.model.Invitation;
import com.test.model.Manager;
import com.test.model.Recruit;
import com.test.model.Resume;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpSession;
import java.util.List;

@Controller
public class ManagerController {
    @Autowired
    private ManagerService managerService;
    @Autowired
    private ResumeService resumeService;
    @Autowired
    private InvitationService invitationService;
    @Autowired
    private RecruitService recruitService;
    @RequestMapping("/managerLogin1")
    public String managerLogin(Manager manager)throws Exception{
        Manager manager1=managerService.selectByNameAndPass(manager);
        if(manager1!=null){
            return "managerMainMenu";
        }
        return "managerLogin";
    }
    @RequestMapping("/managerLookResume")
    public String managerLookResume(HttpSession session)throws Exception{
        List<Resume> list=resumeService.getResume();
        session.setAttribute("managerLookResume",list);
        return "managerLookResume";
    }
    @RequestMapping("/managerInviteTourist")
    public String managerInviteTourist(Invitation invitation,HttpSession session)throws Exception{
        int id= (int) session.getAttribute("touristId1");
        invitation.setI_touristid(id);
        invitation.setI_state("通知面试");
        invitationService.saveInvitation(invitation);
        return "managerLookResume";
    }
    @RequestMapping("/managerLookRecruit")
    public String managerLookRecruit(HttpSession session)throws Exception{
        List<Recruit> list=recruitService.getRecruit();
        session.setAttribute("managerLookRecruit",list);
        return "managerLookRecruit";
    }

}
