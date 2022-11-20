package BridgePattern;
//BridgePattern.BridgePattern.QuestionManager class that will use QuestionAboutCreditCard
// interface which will act as a bridge

public class QuestionManager {
    protected IQuestionAboutCreditCard questionCreditCard;
    public String frequentAskedQuestions;
    public QuestionManager(String frequentAskedQuestions) {
        this.frequentAskedQuestions = frequentAskedQuestions;
    }

    public void newOne(String question) {
        questionCreditCard.newQuestion(question);
    }
    public void delete(String question) {
        questionCreditCard.deleteQuestion(question);
    }
    public void display() {
        questionCreditCard.displayQuestion();
    }
    public void displayAll() {
        System.out.println("Question Paper: " + frequentAskedQuestions);
        questionCreditCard.displayAllQuestions();
    }
}
