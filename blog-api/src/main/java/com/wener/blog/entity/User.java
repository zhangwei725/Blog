package com.wener.blog.entity;

import lombok.*;

import java.io.Serializable;

/**
 * @author zhangwei
 */
@Data
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class User implements Serializable {
    private String name;
    private String password;
}
