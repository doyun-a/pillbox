package com.example.pillbox.controller;


import com.example.pillbox.service.PillService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
public class RegisterController {

    @Autowired
    private PillService pillService;

    @GetMapping("/")
    public String home() {
        return "home";
    }

    @GetMapping("/search")
    public String search(@RequestParam("keyword") String keyword, Model model) {
        // 검색 결과 가져오기
        List<String> searchResults = pillService.searchByKeyword(keyword);

        // 검색 결과를 Model에 추가
        model.addAttribute("keyword", keyword);
        model.addAttribute("results", searchResults);

        return "home"; // home.html 템플릿으로 데이터 전달*/


    }
}
