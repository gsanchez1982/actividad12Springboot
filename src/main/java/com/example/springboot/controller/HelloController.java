/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.example.springboot.controller;


import com.example.springboot.entity.Customer;
import com.example.springboot.repositories.CustomerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/")
public class HelloController {
    

    @Autowired
    private CustomerRepository customerRepository;

    @GetMapping("/")
    @ResponseStatus(HttpStatus.OK)
    public String index() {
        return "Hola Mundo!";
    }

    @PostMapping("/")
    @ResponseStatus(HttpStatus.CREATED)
    public String post() {
        return "Hola Mundo -- object post";
    }
    
    @PutMapping("/")
    @ResponseStatus(HttpStatus.CREATED)
    public String put() {
        return "Hola Mundo -- object put";
    }
    
    @DeleteMapping("/")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public String delete() {
        return "Hola Mundo -- object delete";
    }
    
    
}
