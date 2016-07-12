package com.lollipop.controller;

import com.lollipop.util.GetPaper;
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

    /**
     * Gets tid.
     *
     * @return the tid
     */
    @RequestMapping("/get-tid")
    public ModelAndView getTid() {
        String tid = GetPaper.getTid();
        ModelMap result = new ModelMap();
        result.put("tid", tid);
        return new ModelAndView("index", result);
    }

    /**
     * Gets paper.
     *
     * @return the paper
     */
    @RequestMapping("/get-paper")
    public ModelAndView getPaper() {
        String paper = GetPaper.getPaper(GetPaper.getTid());
        ModelMap result = new ModelMap();
        result.put("paper", paper);
        logger.info("paper={}",paper);
        return new ModelAndView("paper", result);
    }

    @RequestMapping("/getPaperQuestion")
    public ModelAndView getPaperQuestion() {
        GetPaper.getPaperQuestion(GetPaper.getPaper(GetPaper.getTid()));
        return new ModelAndView("paper");
    }
}
