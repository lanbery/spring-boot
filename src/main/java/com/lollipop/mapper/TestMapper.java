package com.lollipop.mapper;

import com.lollipop.model.Test;
import org.springframework.stereotype.Service;

/**
 * Created by lollipop on 16/7/12.
 */
@Service
public interface TestMapper {
    /**
     * Gets test id.
     *
     * @param id the id
     * @return the test id
     */
    Test getTestId(String id);
}
