package StatePattern;

import MediatorPattern.Student;

public class OffLine implements IState {
    private Student student;

    public OffLine(Student student){
        this.student = student;
    }
    @Override
    public void send(String message) {
        System.out.println(student.getName() + " is not logged in and cannot send messages");
    }

    @Override
    public void receive(String message) {
        System.out.println(student.getName() + " is not logged in and cannot receive messages");
    }
}
