package com.example.pillbox.service;


import com.example.pillbox.entity.RegisterEntity;
import com.example.pillbox.repository.RegisterRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class RegisterService {

    @Autowired
    private RegisterRepository registerRepository;

    public void registerPill(String pillName) {
        // 약물 등록 기능
        RegisterEntity registerEntity = new RegisterEntity();
        registerEntity.setPillName(pillName);
        registerRepository.save(registerEntity);
    }

    public List<String> getRegisteredPills() {
        // 등록된 약물 리스트 가져오기
        return registerRepository.findAllPillNames(); // 등록된 약물 이름 리스트 반환
    }

}
