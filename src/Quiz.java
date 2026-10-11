import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Quiz {
    private final List<Question> questions;
    private int score;
    private int currentIndex;

    public Quiz() {
        questions = new ArrayList<>();
        score = 0;
        currentIndex = 0;
        initializeQuestions();
        Collections.shuffle(questions);
    }

    private void initializeQuestions() {
        questions.add(new Question(
                "Which keyword is used to create a class in Java?",
                new String[]{"class", "struct", "function", "interface"},
                0
        ));

        questions.add(new Question(
                "Which of the following is a Java primitive data type?",
                new String[]{"double", "printf", "main", "scanner"},
                0
        ));

        questions.add(new Question(
                "What symbol is used to terminate a Java statement?",
                new String[]{";", ":", ".", ","},
                0
        ));

        questions.add(new Question(
                "Which method is the entry point of a Java program?",
                new String[]{"main()", "start()", "run()", "init()"},
                0
        ));

        questions.add(new Question(
                "Which collection stores key-value pairs?",
                new String[]{"Map", "ArrayList", "Set", "Queue"},
                0
        ));
    }

    public boolean hasNextQuestion() {
        return currentIndex < questions.size();
    }

    public Question getNextQuestion() {
        return questions.get(currentIndex++);
    }

    public void incrementScore() {
        score++;
    }

    public int getScore() {
        return score;
    }

    public int getTotalQuestions() {
        return questions.size();
    }
}
