package com.lsh.mybatisplus.boot.service.impl;

import com.lsh.mybatisplus.boot.entity.Userinfo;
import com.lsh.mybatisplus.boot.mapper.UserinfoMapper;
import com.lsh.mybatisplus.boot.service.IUserinfoService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 * 用户信息表 服务实现类
 * </p>
 *
 * @author leish
 * @since 2019-07-31
 */
@Service
public class UserinfoServiceImpl extends ServiceImpl<UserinfoMapper, Userinfo> implements IUserinfoService {

}
