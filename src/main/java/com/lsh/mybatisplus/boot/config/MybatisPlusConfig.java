package com.lsh.mybatisplus.boot.config;

import com.baomidou.mybatisplus.extension.plugins.PaginationInterceptor;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @author leish
 * @since 2019-08-07
 */
@Configuration
@MapperScan("com.lsh.mybatisplus.boot.mapper")
public class MybatisPlusConfig {

    /**
     * 1.分页插件
     */
    @Bean
    public PaginationInterceptor paginationInterceptor() {
        return new PaginationInterceptor();
    }
}
