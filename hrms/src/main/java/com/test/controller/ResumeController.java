package com.test.controller;

import com.test.biz.RecruitService;
import com.test.biz.ResumeService;
import com.test.model.Recruit;
import com.test.model.Resume;
import com.test.model.Tourist;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpSession;
import java.util.List;

@Controller
public class ResumeController {
    @Autowired
    private ResumeService resumeService;
    @Autowired
    private RecruitService recruitService;
    @RequestMapping("/touristResume1")
    public String touristResume1(Resume resume,HttpSession session)throws Exception{
        int id= (int) session.getAttribute("recruitId");
        Tourist tourist= (Tourist) session.getAttribute("tourist");
        Recruit recruit=recruitService.selectById(id);
        resume.setRe_vocation(recruit.getR_vocation());
        resume.setRe_receive("等待检阅简历");
        resume.setRe_touristid(tourist.getT_id());
        resumeService.saveResume(resume);
        return "touristLookRecruit";
    }
    @RequestMapping("/lookTouristResume")
    public String lookTouristResume(HttpSession session){
        Tourist tourist= (Tourist) session.getAttribute("tourist");
        List<Resume> list=resumeService.getResumeById(tourist.getT_id());
        session.setAttribute("touristResume",list);
        return "touristLookResume";
    }
}
