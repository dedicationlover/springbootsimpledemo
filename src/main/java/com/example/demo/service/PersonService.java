package com.example.demo.service;

import com.example.demo.dao.PersonRepository;
import com.example.demo.entity.PersonEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PersonService {
    @Autowired
    private PersonRepository personRepository;

    public PersonEntity getByFirstName(String firstName){
        List<PersonEntity> tmp = personRepository.findAll();
        PersonEntity personEntity = personRepository.findByFirstName(firstName);
        return personEntity;
    }
}
