package com.example.springboot.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

@Service
public class DataServiceConsumer {

    private final DataService dataService;

    @Autowired
    public DataServiceConsumer(@Qualifier("dataServiceOne") DataService dataService) {
        this.dataService = dataService;
    }

    public String useDataService() {
        return dataService.getInfo();
    }
}
