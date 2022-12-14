package StatePattern;

public interface IState {
    void send(String message);
    void receive(String message);
}
