package service;
import entity.Question;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.List;

//Step 1:first add dependcy spring cloud dependcny mangement, openfeign and spring cloud version at properies section in pom.xml
//  1.1 : create Question client class

// #1.2 FeignClient is an api which we use to communicate with other service/project
@FeignClient(url ="Http://localhost:8082", value="Question-Client")
public interface QuestionClient {


    //1.3 ham questionService  project se data fetch kar rah ha  feign client ke help through is method se
//          dono jagahpar api same hogaa
    @GetMapping("/question/quiz/{quizId}")
    List<Question> getQuestionOfQuiz(@PathVariable Long quizId);

}
