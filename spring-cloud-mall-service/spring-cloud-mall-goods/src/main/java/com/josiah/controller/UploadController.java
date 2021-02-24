package com.josiah.controller;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @title: UploadController
 * @description:
 * @author: zhuxy  zhuxy@pukkasoft.cn
 * @create: 2021-02-24 15:01
 */
@RestController
public class UploadController {

    @PostMapping(value = "/upload")
    public String upload(){
        return "Success";
    }
}
