package com.question.repository;

import com.question.entity.Question;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.query.Param;

import java.util.List;


public interface QuestionRepository  extends JpaRepository<Question,Long> {

   List<Question> findByQuizId(Long quizId);

}
