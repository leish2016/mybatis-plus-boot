package com.lsh.mybatisplus.boot.controller;

import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.lsh.mybatisplus.boot.common.Result;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;

/**
 * 基本的CRUD功能
 * @author leish
 */
public class BaseController<T> {

    @Resource
    ServiceImpl service;

    @PostMapping
    public Result add(T model) {
        service.save(model);
        return Result.genSuccessResult(model);
    }

    @DeleteMapping("/{id}")
    public Result delete(@PathVariable Long id) {
        service.removeById(id);
        return Result.genSuccessResult();
    }

    @PutMapping
    public Result update(@RequestBody T model) {
        service.updateById(model);
        return Result.genSuccessResult();
    }

    @GetMapping("/{id}")
    public Result detail(@PathVariable Long id) {
        return Result.genSuccessResult(service.getById(id));
    }

    @GetMapping
    public Result list(@RequestParam(defaultValue = "1") Integer pageNum, @RequestParam(defaultValue = "5") Integer pageSize) {
        Page<T> page = new Page<>(pageNum, pageSize);
        return Result.genSuccessResult(service.page(page));
    }
}
