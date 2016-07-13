package com.lollipop.controller;

import com.lollipop.model.Exam;
import com.lollipop.model.Points;
import com.lollipop.model.Question;
import com.lollipop.util.GetPaperDetails;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import java.util.ArrayList;

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
        String tid = GetPaperDetails.getTid();
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
        String paper = GetPaperDetails.getPaper(GetPaperDetails.getTid());
        ModelMap result = new ModelMap();
        result.put("paper", paper);
        logger.info("paper={}", paper);
        return new ModelAndView("paper", result);
    }

    /**
     * Gets paper question.
     *
     * @return the paper question
     */
    @RequestMapping("/getPaperQuestion")
    public ModelAndView getPaperQuestion() {

        Exam exam = new Exam();
        ArrayList<Question> question = new ArrayList<Question>();
        ArrayList<Points> points = new ArrayList<Points>();

        GetPaperDetails.getPaperQuestion(GetPaperDetails.getPaper(GetPaperDetails.getTid()), exam, question, points);
        logger.info("-----------{}",question.size());
        return new ModelAndView("paper");
    }
}
