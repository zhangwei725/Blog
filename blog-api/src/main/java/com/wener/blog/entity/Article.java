package com.wener.blog.entity;

import lombok.*;

import java.io.Serializable;

/**
 * @author zhangwei
 */
@Data
@Getter
@Setter
@ToString
@AllArgsConstructor
public class Article  implements Serializable {
    private String title;
}
