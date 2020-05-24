package com.sprngframework.psrspringdi.controllers;

import com.sprngframework.psrspringdi.services.GreetingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.AutoConfigureOrder;
import org.springframework.stereotype.Controller;

@Controller
public class PropertyInjectedController {

    @Autowired
    GreetingService greetingService;

    public String getGreeting() {
        return greetingService.sayGreeting();
    }
}
