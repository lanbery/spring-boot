package com.lollipop.controller;

import com.lollipop.model.Test;
import com.lollipop.service.GetTestId;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

/**
 * Created by lollipop on 16/7/12.
 */
@RestController
@RequestMapping("/jike")
public class TestController {
    /**
     * The Get test id.
     */
    @Autowired
    GetTestId getTestId;

    /**
     * Gets tid.
     *
     * @param id the id
     * @return the tid
     */
    @RequestMapping("/id")
    public ModelAndView getTid(@RequestParam String id) {
        Test test = getTestId.getTestId(id);
        ModelMap result = new ModelMap();

        result.put("test", test);
        return new ModelAndView("home", result);
    }

}
