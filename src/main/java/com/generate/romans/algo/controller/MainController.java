package com.generate.romans.algo.controller;

import org.springframework.http.ResponseEntity;

public interface MainController {
    ResponseEntity getRoute();
    ResponseEntity postRoute();
    ResponseEntity putRoute();
    void deleteRoute();
}
