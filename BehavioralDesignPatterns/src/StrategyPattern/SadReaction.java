package StrategyPattern;

public class SadReaction implements IStrategy {
    @Override
    public String sendReactionToMsg(String reaction) {
        System.out.println("Student is sad with this message");
        return reaction;
    }
}
