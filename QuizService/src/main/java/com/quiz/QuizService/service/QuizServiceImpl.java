package com.quiz.QuizService.service;



import com.quiz.QuizService.entity.Quiz;
import org.springframework.stereotype.Service;
import com.quiz.QuizService.repositories.QuizRepository;

import java.util.List;
import java.util.stream.Collectors;
@Service
public  class QuizServiceImpl implements QuizService {

    private QuizRepository quizRepository;
    private QuestionClient questionClient;

    public QuizServiceImpl(QuizRepository quizRepository, QuestionClient questionClient) {
        this.quizRepository = quizRepository;
        this.questionClient = questionClient;
    }

    @Override
    public Quiz add(Quiz quiz) {
        return quizRepository.save(quiz);
    }

    @Override
    //1.4   data fetch hone ke baad is method se unki id's nikal rah ha
//    1.4.1  isme overall id's ayengih '
    public List<Quiz> get() {
        List<Quiz>  quizzes = quizRepository.findAll();

        List<Quiz> newQuizList = quizzes.stream().map(quiz -> {
            quiz.setQuestions(questionClient.getQuestionOfQuiz(quiz.getId()));

            return quiz;
        }).collect(Collectors.toList());

        return newQuizList;

    }


    // 1.4.2 isme se sibh 1 id fetch karengeh
    @Override
    public Quiz get(Long id) {
        Quiz quiz=quizRepository.findById(id).orElseThrow(() -> new RuntimeException("Quiz not  found"));
        quiz.setQuestions(questionClient.getQuestionOfQuiz(quiz.getId()));
        return quiz;
    }
}
