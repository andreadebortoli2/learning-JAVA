import java.util.Scanner;

public class QuestionService {

    Question[] questions = new Question[5];
    String[] selections = new String[5];

    public QuestionService() {

        // Question 1
        String[] question1Options = { "Russia", "China", "Canada", "United States" };
        questions[0] = new Question(1, "What is the largest country in the world by land area?", question1Options,
                "Russia");

        // Question 2
        String[] question2Options = { "Michelangelo", "Leonardo da Vinci", "Raphael", "Rembrandt" };
        questions[1] = new Question(2, "Who painted the Mona Lisa?", question2Options, "Leonardo da Vinci");

        // Question 3
        String[] question3Options = { "Au", "Ag", "Fe", "Cu" };
        questions[2] = new Question(3, "What is the chemical symbol for gold?", question3Options, "Au");

        // Question 4
        String[] question4Options = { "Mars", "Venus", "Jupiter", "Saturn" };
        questions[3] = new Question(4, "Which planet is known as the 'Red Planet'?", question4Options, "Mars");

        // Question 5
        String[] question5Options = { "Asia", "Europe", "North America", "Oceania" };
        questions[4] = new Question(5, "In which continent is Australia located?", question5Options, "Oceania");
    }

    public void displayQuestions() {

        int i = 0;

        for (Question q : questions) {
            System.out.println("Question no. : " + q.getId());
            System.out.println(q.getQuestion());
            String[] options = q.getOptions();
            for (String opt : options) {
                System.out.println("- " + opt);
            }
            Scanner sc = new Scanner(System.in);
            selections[i] = sc.nextLine();
            i++;
        }

        System.out.println("You're answers:");

        for (String s : selections) {
            System.out.println("- " + s);
        }
    }

    public void printScore() {

        int score = 0;

        for (int i = 0; i < questions.length; i++) {

            Question q = questions[i];
            String questionAnswer = q.getAnswer();
            String questionAnswerLC = questionAnswer.toLowerCase();

            String userAnswer = selections[i];
            String userAnswerLC = userAnswer.toLowerCase();

            if (questionAnswerLC.equals(userAnswerLC))
                score += 3;
            else
                score -= 2;

        }

        System.out.println("You're score is: " + score);
    }
}
