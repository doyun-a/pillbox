package com.example.pillbox.controller;

import com.example.pillbox.service.Pill;
import com.fasterxml.jackson.core.JsonProcessingException;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.net.URISyntaxException;
import java.util.concurrent.ExecutionException;

@Controller
public class regiserdb {

    @Autowired
    private Pill pill;

    @ResponseBody
    @GetMapping("/api/pill")
    public String getpill() throws JsonProcessingException, URISyntaxException, ExecutionException, InterruptedException {
        pill.fetchcarefulDataAndSave();
        return "Test successful!";
    }
}
