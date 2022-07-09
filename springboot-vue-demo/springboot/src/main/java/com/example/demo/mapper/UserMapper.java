package com.example.demo.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
//import org.apache.catalina.User;
import com.example.demo.entity.User;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;


@RestController
@RequestMapping("/user")

public interface UserMapper extends BaseMapper<User> {

}
