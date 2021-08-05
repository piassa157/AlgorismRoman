package com.generate.romans.algo.model.roman;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
@Getter
@Setter
public class RomanModel {

    private @Id @GeneratedValue Long id;
    private String algorism;
    private int algorismValue;


    public RomanModel() {
    }

    public RomanModel(String algorism, int algorismValue) {
        this.algorism = algorism;
        this.algorismValue = algorismValue;
    }
}
