package com.sprngframework.psrspringdi.services;

import org.springframework.stereotype.Service;

@Service
public class PropertyInjectedGreetingServiceImpl implements GreetingService{
    @Override
    public String sayGreeting() {
        return "Hello World - Property Injection!";
    }
}
