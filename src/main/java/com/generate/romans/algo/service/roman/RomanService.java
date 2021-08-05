package com.generate.romans.algo.service.roman;

import com.generate.romans.algo.model.roman.RomanModel;
import com.generate.romans.algo.repository.roman.RomanRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class RomanService {

    @Autowired
    private RomanRepository romanRepository;

    public List<RomanModel> getAllAlgorism() {
       return romanRepository.findAll();
    }
}
