package com.generate.romans.algo.controller.dto.roman;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class RomanDTO {
    private String algorism;
    private int algorismValue;

    public RomanDTO() {
    }

    public RomanDTO(String algorism, int algorismValue) {
        this.algorism = algorism;
        this.algorismValue = algorismValue;
    }
}
