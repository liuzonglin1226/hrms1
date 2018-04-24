package com.test.controller;

import com.test.biz.TouristService;
import com.test.model.Tourist;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpSession;

@Controller
public class TouristController {
    @Autowired
    private TouristService touristService;
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
        System.out.println(tourist1);
            if(tourist1==null){
                touristService.saveTourist(tourist);
                return "touristLogin";
            }
        return "touristRegist";
    }
}
