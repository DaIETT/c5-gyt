package com.gyt.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

/**
 * @author Gyt
 * @create 2021-04-04 - 13:41
 */

@Data
@AllArgsConstructor
@NoArgsConstructor
public class User {
    private int id;
    private String username;
    private String mobile;
    private String password;
    private String name;
    private Date birthday;
    private String sex;
    private String email;
    private Date createtime;
    private Date updatetime;

}
