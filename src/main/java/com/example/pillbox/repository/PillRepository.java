package com.example.pillbox.repository;

import com.example.pillbox.entity.PillEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;


public interface PillRepository extends JpaRepository<PillEntity, Long> {


    List<PillEntity> findBy제품명AContainingIgnoreCase(String keyword);
    List<PillEntity> findBy제품명BContainingIgnoreCase(String keyword);



}
