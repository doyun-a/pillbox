package com.example.pillbox.service;

import com.example.pillbox.entity.PillEntity;
import com.example.pillbox.repository.PillRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

@Service
public class PillService {

    @Autowired
    PillRepository pillRepository;

    public List<String> searchByKeyword(String keyword) {

        List<PillEntity> resultsA = pillRepository.findBy제품명AContainingIgnoreCase(keyword);
        List<PillEntity> resultsB = pillRepository.findBy제품명BContainingIgnoreCase(keyword);

        Set<String> uniqueResults = new HashSet<>();


        for (PillEntity entity : resultsA) {
            uniqueResults.add(entity.get제품명A());
        }

        // 제품명B에서 중복 제거
        for (PillEntity entity : resultsB) {
            uniqueResults.add(entity.get제품명B());
        }

        return new ArrayList<>(uniqueResults);
    }
}
