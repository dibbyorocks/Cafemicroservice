package com.example.springbootdemoproductioneureka.controller;

import com.example.springbootdemoproductioneureka.model.Cafe_Model;
import com.example.springbootdemoproductioneureka.repository.Cafe_Repository;
//import com.example.springbootdemoproductioneureka.service.Cafe_Service;
import com.example.springbootdemoproductioneureka.service.Cafe_service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.BindingResult;
import org.springframework.validation.FieldError;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;


@RestController
@RequestMapping("/CafeModel")
public class Cafe_Controller {
    @Autowired
    private Cafe_service cafe_service;

   /*@GetMapping("/{id}")
    public Optional<Cafe_Model> getcheckoutById(@PathVariable Integer id) {
        return cafe_service.getcheckkoutby(id);
    }*/

    @PostMapping("/addcheckout")
    //public ResponseEntity<Cafe_Model> addcheckout(@RequestBody Cafe_Model cafe_model) {
    public  Cafe_Model addcheckout(@Valid @RequestBody Cafe_Model cafe_model)
    {

     return cafe_service.addcafe(cafe_model);

    }
    @GetMapping("/getCafe")
    public List<Cafe_Model> getcheckout() {
        return cafe_service.getAll();
    }


}
