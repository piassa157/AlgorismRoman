package com.generate.romans.algo.controller.roman;

import com.generate.romans.algo.controller.dto.roman.RomanDTO;
import com.generate.romans.algo.controller.dto.roman.RomanPostDTO;
import com.generate.romans.algo.model.roman.RomanModel;
import com.generate.romans.algo.service.roman.RomanService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.util.UriComponents;
import org.springframework.web.util.UriComponentsBuilder;

import java.net.URI;
import java.util.List;

@RestController
@RequestMapping("/roman")
public class RomanController{

    @Autowired
    private RomanService romanService;

    @GetMapping
    public ResponseEntity<List<RomanModel>> getRoute() {
        return ResponseEntity.ok(romanService.getAllAlgorism());
    }

    @PostMapping
    public ResponseEntity<RomanDTO> postRoute(@RequestBody RomanPostDTO romanPostDTO, UriComponentsBuilder uriComponentsBuilder) {
        RomanModel algorism = romanService.createAlgorism(romanPostDTO);
        URI uri = uriComponentsBuilder.path("/roman/{id}").buildAndExpand(algorism.getId()).toUri();
        return ResponseEntity.created(uri).body(new RomanDTO(algorism.getAlgorism(), algorism.getAlgorismValue()));
    }

    @PutMapping
    public ResponseEntity<RomanDTO> putRoute() {
        return null;
    }

    @DeleteMapping
    public void deleteRoute() {

    }
}
