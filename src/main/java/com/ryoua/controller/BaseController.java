package com.ryoua.controller;

import com.google.gson.Gson;
import com.ryoua.model.common.Audience;
import com.ryoua.service.ApiTestService;
import com.ryoua.service.MachineInfoService;
import com.ryoua.service.UserService;
import com.ryoua.utils.RedisUtil;
import com.ryoua.utils.TokenUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.client.RestTemplate;

/**
 * * @Author: RyouA
 * * @Date: 2020/7/22
 **/
public class BaseController {
    @Autowired
    Gson gson;

    @Autowired
    RedisUtil redisUtil;

    @Autowired
    MachineInfoService machineInfoService;

    @Autowired
    TokenUtil tokenUtil;

    @Autowired
    Audience audience;

    @Autowired
    UserService userService;

    @Autowired
    ApiTestService apiTestService;


}
