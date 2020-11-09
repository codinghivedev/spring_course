package dev.codinghive.dependencyinjection.controllers;

import org.springframework.stereotype.Controller;

@Controller
public class MyController {

    public String sayHello(){
        System.out.println("Say");
        return "Hi Musab";
    }
}
