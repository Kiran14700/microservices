package entity;


import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

//1.2 we create an question class
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Question {

    private Long questionId;

    private String question;

    private Long quizId;
}
