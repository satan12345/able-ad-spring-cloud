package com.able.ad.controller;

import com.able.ad.exception.AdException;
import com.able.ad.service.UserService;
import com.able.ad.vo.CreateUserRequest;
import com.able.ad.vo.CreateUserResponse;
import com.alibaba.fastjson.JSON;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by Qinyi.
 */
@Slf4j
@RestController
public class UserOPController {

    private final UserService userService;

    @Autowired
    public UserOPController(UserService userService) {
        this.userService = userService;
    }

    @PostMapping("/create/user")
    public CreateUserResponse createUser(
            @RequestBody CreateUserRequest request) throws AdException {
        log.info("ad-sponsor: createUser -> {}",
                JSON.toJSONString(request));
        return userService.createUser(request);
    }
}
