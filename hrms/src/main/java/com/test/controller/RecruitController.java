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
}
