package com.lollipop.service;

import com.lollipop.mapper.TestMapper;
import com.lollipop.model.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by lollipop on 16/7/12.
 */
@Service
public class GetTestId {
    /**
     * The Test mapper.
     */
    @Autowired
    TestMapper testMapper;

    /**
     * Gets test id.
     *
     * @param id the id
     * @return the test id
     */
    public Test getTestId(String id) {
        return testMapper.getTestId(id);
    }
}
