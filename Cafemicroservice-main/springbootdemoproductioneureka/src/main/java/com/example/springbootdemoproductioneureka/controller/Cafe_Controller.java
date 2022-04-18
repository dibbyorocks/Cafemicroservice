package com.example.springbootdemoproductioneureka.controller;

import com.example.springbootdemoproductioneureka.model.Cafe;
//import com.example.springbootdemoproductioneureka.service.Cafe_Service;
import com.example.springbootdemoproductioneureka.service.Cafe_service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;


@RestController
@RequestMapping("/CafeModel")
public class Cafe_Controller {
    @Autowired
    private Cafe_service cafe_service;

   @GetMapping("/{id}")
   //@RequestMapping("{id}")
    public Cafe getById(@PathVariable int id) {
        return cafe_service.getById(id);
    }

    @PostMapping("/addcheckout")
    @ResponseStatus(HttpStatus.CREATED)
    //public ResponseEntity<Cafe_Model> addcheckout(@RequestBody Cafe_Model cafe_model) {
    public Cafe addcheckout(@Valid @RequestBody Cafe cafe_model)
    {

     return cafe_service.addcafe(cafe_model);

    }
    @GetMapping("/getCafe")
    public List<Cafe> getcheckout()
    {
        return cafe_service.getAll();
    }


}
