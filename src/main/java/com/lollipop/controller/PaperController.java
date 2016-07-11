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
@RequestMapping("/jike")
public class PaperController {
    private final Logger logger = LoggerFactory.getLogger(PaperController.class);

    @RequestMapping("/get-tid")
    public ModelAndView getTid() {
        GetPaper getPaper = new GetPaper();
        String tid = getPaper.getTid();
        ModelMap result = new ModelMap();
        result.put("tid", tid);
        return new ModelAndView("index", result);
    }

    @RequestMapping("/get-paper")
    public ModelAndView getPaper() {
        GetPaper getPaper = new GetPaper();
        String paper = getPaper.getPaper(getPaper.getTid());
        ModelMap result = new ModelMap();
        result.put("paper", paper);
        logger.info("paper={}",paper);
        return new ModelAndView("paper", result);
    }
}
