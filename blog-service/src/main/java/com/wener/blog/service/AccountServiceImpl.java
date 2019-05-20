package com.wener.blog.service;

/**
 * @author zhangwei
 */

import com.wener.blog.api.IAccountService;
import com.wener.blog.entity.User;
import org.apache.dubbo.config.annotation.Service;
import org.apache.dubbo.config.spring.context.annotation.EnableDubbo;

import java.util.ArrayList;
import java.util.List;


@Service(version = "${dubbo.version}")
@EnableDubbo
public class AccountServiceImpl implements IAccountService {
    @Override
    public List<User> users() {
        List<User> users = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            users.add(new User("test" + i, "123456"));
        }
        return users;
    }
}
