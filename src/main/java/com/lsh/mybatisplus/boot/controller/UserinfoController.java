package com.lsh.mybatisplus.boot.controller;


import cn.hutool.core.util.IdUtil;
import com.lsh.mybatisplus.boot.entity.Userinfo;
import com.lsh.mybatisplus.boot.mapper.UserinfoMapper;
import com.lsh.mybatisplus.boot.service.IUserinfoService;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import org.springframework.stereotype.Controller;

import javax.validation.Valid;
import java.util.List;
import java.util.Map;

/**
 * <p>
 * 用户信息表 前端控制器
 * </p>
 *
 * @author leish
 * @since 2019-07-31
 */
@RestController
@RequestMapping("api/userinfo")
public class UserinfoController {

    @Autowired
    IUserinfoService userService;

    @Autowired
    UserinfoMapper userinfoMapper;

    @PostMapping("/user")
    @ApiOperation("添加用户")
    public Userinfo addUserInfo(Userinfo userReq){
        long id = IdUtil.getSnowflake(1,1).nextId();
        userReq.setId(id);
        userService.save(userReq);
        return userinfoMapper.selectById(id);
    }


    @GetMapping("/users")
    @ApiOperation("查询所有用户")
    public List<Userinfo> findAllUserInfo() {
        return userService.list();
    }

}
