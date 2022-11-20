package BridgePattern;

import java.util.ArrayList;
import java.util.List;

public class ClientQuestions implements IQuestionAboutCreditCard {

    private List<String> questions = new ArrayList<String>();
    private int current = 0;

    public ClientQuestions(){
        questions.add("What is a credit card?");
        questions.add("How to open a card?");
        questions.add("How do credit cards work? ");
        questions.add("Can you buy a car with a credit card? ");

    }

    @Override
    public void newQuestion(String newQuestion) {
        questions.add(newQuestion);
    }

    @Override
    public void deleteQuestion(String deletedQuestion) {
        questions.remove(deletedQuestion);
    }

    @Override
    public void displayQuestion() {
        System.out.println( questions.get(current) );
    }

    @Override
    public void displayAllQuestions() {
        for (String quest : questions) {
            System.out.println(quest);
        }
    }
}
