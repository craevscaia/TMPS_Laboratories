package MediatorPattern;

import StatePattern.OffLine;
import StatePattern.OnLine;
import StatePattern.IState;

public abstract class Student {
    protected IStudentChat chat;
    protected String name;
    protected IState state;

    public Student(IStudentChat chat, String name){
        this.chat = chat;
        this.name = name;
    }

    public abstract String send(String msg);

    public abstract void receive(String msg);

    public String getName(){
        return this.name;
    }

    public IStudentChat getMediator() {
        return this.chat;
    };

    public void onLine() {
        this.state = new OnLine(this);
    };

    public void offLine() {
        this.state = new OffLine(this);
    };

    public String getState() {
        return this.state.getClass().getSimpleName();
    };
}
