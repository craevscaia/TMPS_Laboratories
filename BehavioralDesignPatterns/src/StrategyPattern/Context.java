package StrategyPattern;

public class Context {
    private IStrategy strategy;

    public Context(IStrategy strategy){
        this.strategy = strategy;
    }

    public String executeStrategy(String message){
        return strategy.sendReactionToMsg(message);
    }
}
