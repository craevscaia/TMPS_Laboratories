package BridgePattern;

public class BridgePattern {
    public static void main(String[] args) {
        QuestionManager questions = new QuestionManager("Frequent asked questions");
        questions.questionCreditCard = new ClientQuestions();
        questions.newOne("How secure is credit card ?");
        System.out.println();
        questions.displayAll();
    }
}
