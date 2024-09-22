package com.gyeongmin.testSpringBoot;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class BasicCont {
    @GetMapping("/")
    @ResponseBody
    public String home() {
        return "Hello World <br> <a href='/about'>About</a>";
    }

    @GetMapping("/about")
    @ResponseBody
    public String about() {
        return "about page";
    }

    @GetMapping("/test")
    public String testJsp() {
        return "test";
    }


}


