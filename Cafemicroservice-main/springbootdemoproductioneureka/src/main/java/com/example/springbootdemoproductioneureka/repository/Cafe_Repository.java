package com.example.springbootdemoproductioneureka.repository;

import com.example.springbootdemoproductioneureka.model.Cafe;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface Cafe_Repository extends JpaRepository<Cafe,Integer>
{


}
