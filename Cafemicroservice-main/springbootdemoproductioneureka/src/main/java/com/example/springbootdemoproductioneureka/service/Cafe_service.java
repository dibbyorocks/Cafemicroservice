package com.example.springbootdemoproductioneureka.service;

import com.example.springbootdemoproductioneureka.model.Cafe;
import com.example.springbootdemoproductioneureka.repository.Cafe_Repository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class Cafe_service {
    public List<Cafe> getAll;
    @Autowired
    private Cafe_Repository cafeRepository;



    public Cafe addcafe(Cafe cafe_model)
    {
        return cafeRepository.save(cafe_model);
    }

    public List<Cafe> getAll() {
        return cafeRepository.findAll();
    }

    public Cafe getById(int id) {
        return cafeRepository.getById(id);
    }


  /*  public Optional<Cafe_Model> getcheckkoutby(Integer id) {
return Optional.of(cafeRepository.getById(id));
    }*/
}
