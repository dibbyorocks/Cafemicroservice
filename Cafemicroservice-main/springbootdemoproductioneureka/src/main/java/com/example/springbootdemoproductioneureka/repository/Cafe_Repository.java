package com.example.springbootdemoproductioneureka.repository;

import com.example.springbootdemoproductioneureka.model.Cafe_Model;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface Cafe_Repository extends JpaRepository<Cafe_Model,Integer>
{


}
