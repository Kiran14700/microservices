package com.quiz.demo.service;

import com.quiz.demo.entity.Quiz;

import java.util.List;

public interface QuizService {

    Quiz add(Quiz quiz);

    List<Quiz> get();

    Quiz get(Long id);


}
