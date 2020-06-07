package com.macro.cloud.domain;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

/**
 * Created by jeason on 2019/8/29.
 */
@ApiModel(description = "user")
public class User {

    @ApiModelProperty(name = "id",value = "id",required = true)
    private Long id;
    @ApiModelProperty(name = "username",value = "username",required = true)
    private String username;
    @ApiModelProperty(name = "password",value = "password",required = true)
    private String password;

    public User(){}

    public User(Long id, String username, String password) {
        this.id = id;
        this.username = username;
        this.password = password;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
