package com.yzb.service.impl;

import com.yzb.mapper.TestMapper;
import com.yzb.service.ITestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

@Service
public class TestServiceImpl implements ITestService {

    @Autowired
    private TestMapper testMapper;

    @Override
    public List<Map<String, Object>> likeSearch(Map<String, Object> param) {
        try {
            return testMapper.likeSearch(param);
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }
}
