package com.test.controller;

import com.test.biz.RecruitService;
import com.test.model.Recruit;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpSession;
import java.util.List;

@Controller
public class RecruitController {
    @Autowired
    private RecruitService recruitService;
    @RequestMapping("/touristLookRecruit")
    public String touristLookRecruit(HttpSession session)throws Exception{
        List<Recruit> list=recruitService.getRecruit();
        session.setAttribute("recruitList",list);
        return "touristLookRecruit";
    }
    @RequestMapping("/managerUpdateRecruit")
    public String managerUpdateRecruit(Recruit recruit,HttpSession session)throws Exception{
        if(recruit.getR_state().equals("未上传")){
            recruitService.updateRecruit(recruit);
            List<Recruit> list=recruitService.getRecruit();
            session.setAttribute("managerLookRecruit",list);
        }
        return "managerLookRecruit";
    }
    @RequestMapping("/managerSaveRecruit")
    public String managerSaveRecruit(Recruit recruit,HttpSession session)throws Exception{
        recruit.setR_state("未上传");
        Recruit recruit1=recruitService.selectByVocation(recruit.getR_vocation());
        if(recruit1==null){
            recruitService.saveRecruit(recruit);
            List<Recruit> list=recruitService.getRecruit();
            session.setAttribute("managerLookRecruit",list);
        }
        return "managerLookRecruit";
    }
    @RequestMapping("/managerUpRecruit")
    public String managerUpRecruit(Recruit recruit,HttpSession session)throws Exception{
        recruit.setR_state("已上传");
        System.out.println(recruit);
        recruitService.updateRecruit(recruit);
        List<Recruit> list=recruitService.getRecruit();
        session.setAttribute("managerLookRecruit",list);
        return "managerLookRecruit";
    }
    @RequestMapping("/managerDownRecruit")
    public String managerDownRecruit(Recruit recruit,HttpSession session)throws Exception{
        recruit.setR_state("未上传");
        recruitService.updateRecruit(recruit);
        List<Recruit> list=recruitService.getRecruit();
        session.setAttribute("managerLookRecruit",list);
        return "managerLookRecruit";
    }
    @RequestMapping("/managerDeleteRecruit")
    public String managerDeleteRecruit(Recruit recruit,HttpSession session)throws Exception{
        if(recruit.getR_state().equals("未上传")){
            recruitService.deleteRecruit(recruit);
            List<Recruit> list=recruitService.getRecruit();
            session.setAttribute("managerLookRecruit",list);
        }
        return "managerLookRecruit";
    }
}
