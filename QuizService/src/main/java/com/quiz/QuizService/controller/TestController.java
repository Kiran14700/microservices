package com.quiz.QuizService.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/quiz-test")
public class TestController {

    @GetMapping
    public String test() {
      return  "Testing";
    }
}
