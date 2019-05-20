package com.wener.blog.api;


import com.wener.blog.entity.User;

import java.util.List;

/**
 * @author zhangwei
 */
public interface IAccountService {
    public List<User> users();
}
