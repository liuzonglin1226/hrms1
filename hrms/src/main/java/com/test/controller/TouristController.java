package com.test.controller;

import com.test.biz.InvitationService;
import com.test.biz.ResumeService;
import com.test.biz.TouristService;
import com.test.model.Invitation;
import com.test.model.Resume;
import com.test.model.Tourist;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpSession;
import java.util.List;

@Controller
public class TouristController {
    @Autowired
    private TouristService touristService;
    @Autowired
    private InvitationService invitationService;
    @Autowired
    private ResumeService resumeService;
    @RequestMapping("/touristLogin1")
    public String touristLogin(Tourist tourist, HttpSession session)throws Exception{
        Tourist tourist1=touristService.selectByNameAndPass(tourist);
        if(tourist1==null){
            return "touristLogin";
        }else {
            session.setAttribute("tourist",tourist1);
            return "touristMainMenu";
        }
    }
    @RequestMapping("/touristRegist1")
    public String touristRegist(Tourist tourist)throws Exception{
        Tourist tourist1=touristService.selectByName(tourist);
            if(tourist1==null){
                touristService.saveTourist(tourist);
                return "touristLogin";
            }
        return "touristRegist";
    }
    @RequestMapping("/touristLookInvitation")
    public String touristLookInvitation(HttpSession session)throws Exception{
        Tourist tourist= (Tourist) session.getAttribute("tourist");
        List<Invitation> list=invitationService.selectByTouristId(tourist.getT_id());
        session.setAttribute("touristLookInvitation",list);
        return "touristLookInvitation";
    }
    @RequestMapping("/touristInviting")
    public String touristInviting(Invitation invitation,HttpSession session)throws Exception{
        invitationService.deleteInvitationById(invitation.getI_id());
        Resume resume=new Resume();
        resume.setRe_id(invitation.getI_resumeid());
        resume.setRe_receive("等待面试结果");
        resumeService.updateResume(resume);
        Tourist tourist= (Tourist) session.getAttribute("tourist");
        List<Invitation> list=invitationService.selectByTouristId(tourist.getT_id());
        session.setAttribute("touristLookInvitation",list);
        return "touristLookInvitation";
    }
}
