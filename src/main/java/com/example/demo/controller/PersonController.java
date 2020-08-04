package com.example.demo.controller;

import com.example.demo.entity.PersonEntity;
import com.example.demo.service.PersonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.Date;

@RestController
@RequestMapping("/")
public class PersonController {
    @Autowired
    private PersonService personService;

    @RequestMapping("getOne")
    @ResponseBody
    public PersonEntity getByFirstName(){
        String firstName = "liu";
        PersonEntity personEntity = personService.getByFirstName(firstName);
        return personEntity;
    }
}
