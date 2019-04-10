package com.springboot.demo.moduleone;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FirstModuleController {


    @GetMapping("/firstModule")
    public String firstModule(){
        return "First Module";
    }
}
