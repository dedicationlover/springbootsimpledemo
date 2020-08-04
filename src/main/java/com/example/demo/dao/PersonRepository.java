package com.example.demo.dao;

import com.example.demo.entity.PersonEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PersonRepository extends JpaRepository<PersonEntity, String> {
    PersonEntity findByFirstName(String firstName);
}
