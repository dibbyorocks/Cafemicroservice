package com.example.springbootdemoproductioneureka.service;

import com.example.springbootdemoproductioneureka.model.Cafe_Model;
import com.example.springbootdemoproductioneureka.repository.Cafe_Repository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class Cafe_service {
    public List<Cafe_Model> getAll;
    @Autowired
    private Cafe_Repository cafeRepository;



    public Cafe_Model addcafe(Cafe_Model cafe_model)
    {
        return cafeRepository.save(cafe_model);
    }

    public List<Cafe_Model> getAll() {
        return cafeRepository.findAll();
    }


  /*  public Optional<Cafe_Model> getcheckkoutby(Integer id) {
return Optional.of(cafeRepository.getById(id));
    }*/
}
