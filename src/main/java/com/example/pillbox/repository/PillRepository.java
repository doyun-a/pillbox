package com.example.pillbox.repository;

import com.example.pillbox.entity.PillEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PillRepository extends JpaRepository<PillEntity, Long> {
}
