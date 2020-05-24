package com.sprngframework.psrspringdi.services;

import org.springframework.stereotype.Service;

@Service
public class SetterInjectionGreetingServiceImpl implements GreetingService{
    @Override
    public String sayGreeting() {
        return "Hello World - Setter Injection!";
    }
}
