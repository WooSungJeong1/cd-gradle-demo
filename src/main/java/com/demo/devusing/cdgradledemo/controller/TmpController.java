package com.demo.devusing.cdgradledemo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TmpController {

    @GetMapping("/temp")
    public String temp(){
        return "TEMP test!!";
    }
}
