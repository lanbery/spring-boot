package com.lollipop.mapper;

import com.lollipop.model.Test;
import org.springframework.stereotype.Service;

/**
 * Created by lollipop on 16/7/12.
 */

@Service
public interface TestMapper {
    Test getTestId(String id);
}
