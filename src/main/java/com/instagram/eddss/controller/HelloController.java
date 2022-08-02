package com.instagram.eddss.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

@Controller
public class HelloController {

    @RequestMapping(value="/login", method=RequestMethod.GET)
    public ModelAndView index() {
        ModelAndView mav = new ModelAndView();
        List<String> resultList = new ArrayList<String>();
        
        resultList.add("AAA");
        resultList.add("BBB");
        resultList.add("CCC");
        resultList.add("DDD");
        resultList.add("EEE");
        resultList.add("FFF");
        
        mav.addObject("resultList",resultList);
        mav.setViewName("content/login");
        
        return mav;
    }

    @RequestMapping(value="/", method = RequestMethod.GET)
    public String getHomePage(){
        return "index";
    }
}
