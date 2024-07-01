package com.example.springboot.service;

import org.springframework.stereotype.Component;

@Component("dataServiceTwo")
public class DataServiceTwo implements DataService {
    @Override
    public String getInfo() {
        return "Data Service Two";
    }
}
