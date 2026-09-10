package com.quiz.demo.repsoitory;

import com.quiz.demo.entity.Quiz;
import org.springframework.data.jpa.repository.JpaRepository;

public interface  QuizRepository  extends JpaRepository<Quiz, Long> {

}
