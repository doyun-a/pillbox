package com.example.pillbox.repository;

import com.example.pillbox.entity.RegisterEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface RegisterRepository extends JpaRepository<RegisterEntity, Long> {

    @Query("SELECT r.PillName FROM RegisterEntity r")  // JPQL 사용
    List<String> findAllPillNames();
}
