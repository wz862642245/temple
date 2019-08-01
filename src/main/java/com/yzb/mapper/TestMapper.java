package com.yzb.mapper;

import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Map;

@Repository
public interface TestMapper {

    int searchCount(Map<String, Object> param);

    List<Map<String, Object>> likeSearch(Map<String, Object> param);
}
