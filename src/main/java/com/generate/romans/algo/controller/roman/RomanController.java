package com.generate.romans.algo.controller.roman;

import com.generate.romans.algo.controller.MainController;
import com.generate.romans.algo.controller.dto.roman.RomanDTO;
import com.generate.romans.algo.model.roman.RomanModel;
import com.generate.romans.algo.service.roman.RomanService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/roman")
public class RomanController implements MainController {

    @Autowired
    private RomanService romanService;

    @GetMapping
    @Override
    public ResponseEntity<List<RomanModel>> getRoute() {
        return ResponseEntity.ok(romanService.getAllAlgorism());
    }

    @PostMapping
    @Override
    public ResponseEntity<RomanDTO> postRoute() {
        return null;
    }

    @PutMapping
    @Override
    public ResponseEntity<RomanDTO> putRoute() {
        return null;
    }

    @DeleteMapping
    @Override
    public void deleteRoute() {

    }
}
