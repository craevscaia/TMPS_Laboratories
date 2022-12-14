package StrategyPattern;

public class HappyReaction implements IStrategy {
    @Override
    public String sendReactionToMsg(String message) {
        System.out.println("Student is happy with this message");
        return message;
    }
}
