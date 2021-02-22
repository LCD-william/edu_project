package com.william.eduservice.controller;


import com.william.eduservice.entity.EduTeacher;
import com.william.eduservice.service.EduTeacherService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * <p>
 * 讲师 前端控制器
 * </p>
 *
 * @author testjava
 * @since 2021-02-21
 */


@RestController
@RequestMapping("/eduservice/teacher")
public class EduTeacherController {

    @Autowired
    private EduTeacherService eduTeacherService;

    @ApiOperation(value = "所有讲师列表")
    @GetMapping("findAll")
    public List<EduTeacher> findAllTeachers(){

        List<EduTeacher> list = eduTeacherService.list(null);

        return list;
    }

    @ApiOperation(value = "删除一个讲师")
    @DeleteMapping("{id}")
    public boolean deleteTeacherById(@PathVariable String id){
        boolean isDeleted = eduTeacherService.removeById(id);
        return isDeleted;
    }

}

