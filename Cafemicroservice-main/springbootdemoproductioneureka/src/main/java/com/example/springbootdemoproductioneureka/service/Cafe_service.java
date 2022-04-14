package com.example.springbootdemoproductioneureka.service;

import com.example.springbootdemoproductioneureka.model.Cafe_Model;
import com.example.springbootdemoproductioneureka.repository.Cafe_Repository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class Cafe_service {
    @Autowired
    private Cafe_Repository cafeRepository;
    public Cafe_Model addcafe(Cafe_Model cafe_model)
    {
        return cafeRepository.save(cafe_model);
    }
}
