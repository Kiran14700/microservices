package com.quiz.demo.service;

import com.quiz.demo.entity.Quiz;
import com.quiz.demo.repsoitory.QuizRepository;

import java.util.List;

public  class QuizServiceImpl implements QuizService {

    private QuizRepository quizRepository;

    public QuizServiceImpl(QuizRepository quizRepository) {
        this.quizRepository = quizRepository;
    }

    @Override
    public Quiz add(Quiz quiz) {
        return quizRepository.save(quiz);
    }

    @Override
    public List<Quiz> get() {
        return quizRepository.findAll();

    }

    @Override
    public Quiz get(Long id) {
        return quizRepository.findById(id).orElseThrow(() -> new RuntimeException("Quiz not  found"));
    }
}
