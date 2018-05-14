package project.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@org.springframework.stereotype.Controller
public class Controller {

    @GetMapping("/")
    @ResponseBody
    public String hello (){
        return "hello";
    }

    @GetMapping("/api/notification")
    @ResponseBody
    public String test (){
        return "d67c0680";
    }
}
