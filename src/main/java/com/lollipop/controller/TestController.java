package com.lollipop.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

/**
 * Created by lollipop on 16/7/7.
 */

@RestController
@RequestMapping("/")
public class TestController {
    private final Logger logger = LoggerFactory.getLogger(TestController.class);

    @RequestMapping("")
    public String home() {
        return "hello";
    }

    @RequestMapping("/getTid")
    public ModelAndView getTid() {
        GetPaper getPaper = new GetPaper();
        String tid = getPaper.getTid();
        ModelMap result = new ModelMap();



        result.put("tid", tid);
        logger.info("getTid={}",result.get("tid"));
        return new ModelAndView("index", result);
    }
}
