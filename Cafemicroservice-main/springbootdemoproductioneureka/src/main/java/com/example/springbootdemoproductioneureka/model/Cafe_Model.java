package com.example.springbootdemoproductioneureka.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Positive;
import javax.validation.constraints.PositiveOrZero;
import java.util.ArrayList;

@Data
@Entity
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class Cafe_Model {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;
    @NotNull(message="please enter your correct name")
    private String name;
    @NotNull(message =" Please enter the order")
    private String checkout;
    @NotNull(message =" Please enter the price")
    private int price;



}
