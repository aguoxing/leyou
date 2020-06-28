package com.leyou.user.entity;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.Data;
import org.hibernate.validator.constraints.Length;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.Pattern;
import java.io.Serializable;
import java.util.Date;

/**
 * @author guoxing
 * @date 2020/6/27 15:43
 */
@Data
@Table(name = "tb_user")
public class User implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    /**
     * 用户名
     */
    @Length(min = 4, max = 30, message = "用户名只能在4~30位之间")
    private String username;

    /**
     * 密码
     */
    @JsonIgnore
    @Length(min = 4, max = 30, message = "用户名只能在4~30位之间")
    private String password;

    /**
     * 电话
     */
    @Pattern(regexp = "^1[35678]\\d{9}$", message = "手机号格式不正确")
    private String phone;

    /**
     * 创建时间
     */
    private Date created;

    /**
     * 密码的盐值
     */
    @JsonIgnore
    private String salt;
}
