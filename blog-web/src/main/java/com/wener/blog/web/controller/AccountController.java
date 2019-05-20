package com.wener.blog.web.controller;

import com.wener.blog.api.IAccountService;
import com.wener.blog.entity.User;
import org.apache.dubbo.config.annotation.Reference;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;


/**
 * @author zhangwei
 */
@RestController
public class AccountController {
    @Reference(version = "${dubbo.version}")
    IAccountService service;

    @RequestMapping("/")
    public List<User> list() {
        List<User> users = service.users();
        return users;
    }
}
