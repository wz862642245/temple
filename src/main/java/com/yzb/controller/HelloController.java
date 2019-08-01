package com.yzb.controller;

import com.yzb.base.BaseController;
import com.yzb.service.ITestService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Controller
@RequestMapping("hello")
public class HelloController extends BaseController {

    private static final Logger logger = LoggerFactory.getLogger(HelloController.class);

    @Autowired
    private ITestService iTestService;

    @RequestMapping("word")
    @ResponseBody
    public String hello(){

        return "hello word！";
    }

    @RequestMapping("likeSearch")
    @ResponseBody
    public List<Map<String,Object>> likeSearch(HttpServletRequest request){
        Map<String,Object> param = new HashMap<>();
        param.put("pageIndex" , 1);
        param.put("pageNum" , 20);
        param.put("user_name" , request.getParameter("user_name"));
        return iTestService.likeSearch(param);
    }
}
