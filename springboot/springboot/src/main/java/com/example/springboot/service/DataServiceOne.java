package com.example.springboot.service;

import org.springframework.stereotype.Component;

@Component("dataServiceOne")
public class DataServiceOne implements DataService {
    @Override
    public String getInfo() {
        return "Data Service One";
    }
}
