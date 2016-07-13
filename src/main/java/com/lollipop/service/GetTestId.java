package com.lollipop.service;

import com.lollipop.mapper.TestMapper;
import com.lollipop.model.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

/**
 * Created by lollipop on 16/7/12.
 */
@Component
public class GetTestId {
    @Autowired
    TestMapper testMapper;

    public Test getTestId(String id) {
        return testMapper.getTestId(id);
    }
}
