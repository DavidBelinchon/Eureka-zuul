package com.demo.cosa.service;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class SampleService {


    public String welcome(String userName) {
        return "Welcome " + userName;
    }

}
