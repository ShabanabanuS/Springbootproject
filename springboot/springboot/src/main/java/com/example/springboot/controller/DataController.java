package com.example.springboot.controller;

import com.example.springboot.service.DataServiceConsumer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DataController {

    private final DataServiceConsumer dataServiceConsumer;

    @Autowired
    public DataController(DataServiceConsumer dataServiceConsumer) {
        this.dataServiceConsumer = dataServiceConsumer;
    }

    @GetMapping("/")
    public String getData() {
        return dataServiceConsumer.useDataService();
    }
}
