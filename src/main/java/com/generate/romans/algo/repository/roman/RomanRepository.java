package com.generate.romans.algo.repository.roman;

import com.generate.romans.algo.model.roman.RomanModel;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RomanRepository extends JpaRepository<RomanModel, Long> {
}
