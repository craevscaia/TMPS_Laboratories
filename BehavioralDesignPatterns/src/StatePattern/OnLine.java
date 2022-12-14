package StatePattern;

import MediatorPattern.Student;

public class OnLine implements IState {

    private Student student;

    public OnLine(Student student){
        this.student = student;
    }

    @Override
    public void send(String message) {
        System.out.println(student.getName() + ": Sending Message: " + message);
        student.getMediator().sendMessage(message, student);

    }

    @Override
    public void receive(String message) {
        System.out.println(student.getName() + ": Received Message: " + message);

    }
}
