package com.quiz.QuizService.service;
import com.quiz.QuizService.entity.Question;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.List;

//Step 1:first add dependcy spring cloud dependcny mangement, openfeign and spring cloud version at properies section in pom.xml
//  1.1 : create Question client class

// #1.2 FeignClient is an api which we use to communicate with other service/project
//@FeignClient(url ="http://localhost:8082", value="Question-Client")    //step 1 ka ha yeh new load-balancing meh alag port use kr rha ha ilisya comment kiya hain


//2.9  ham aab question-service ki instance direct use karnegeh iski help se
//3.1  iski help se aab ham directly quiz ke localhost se question ka data bhi call kar rah ha

//3.2 simple meaning ha ki agar ham ek instance/service band rakhtah ha or dusra on raktah toh data dusra service se bhi call ho jaayega isko hi load-balancing kehtah ha
//3.3 hamne question service ke ek service yah intellij par run ki ha aur ek service 8082 termianl pr run ki ha
//3.4 toh load-balancing ki help se agar ek instance/service  band hoga toh data dusra service se call hogaaa
@FeignClient(name = "QUESTION-SERVICE")
public interface QuestionClient {


    //1.3 ham questionService  project se data fetch kar rah ha  feign client ke help through is method se
//          dono jagahpar api same hogaa
    @GetMapping("/question/quiz/{quizId}")
    List<Question> getQuestionOfQuiz(@PathVariable Long quizId);

}
