package com.springboot.demo.moduletwo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SecondModuleController {


    @GetMapping("/secondModule")
    public String firstModule(){
        return "Second Module";
    }
}
