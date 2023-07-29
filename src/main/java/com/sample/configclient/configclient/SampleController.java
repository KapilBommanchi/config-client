package com.sample.configclient.configclient;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SampleController {
    @Autowired
    Sample sample;

    @GetMapping("/show")
    public String getValue() {
        String name = sample.getName();
        System.out.println("name is :: "+name);
        return name;
    }
}
