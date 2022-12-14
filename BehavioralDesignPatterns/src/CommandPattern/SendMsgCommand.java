package CommandPattern;

import MediatorPattern.IStudentChat;
import MediatorPattern.Student;

//This is a concrete command
public class SendMsgCommand implements ICommand {
    private IStudentChat chat;
    private String msg;
    private Student student;

    public SendMsgCommand(IStudentChat chat, String msg, Student student ) {
        this.chat = chat;
        this.msg = msg;
        this.student = student;
    }
    @Override
    public void execute() {
        chat.sendMessage(msg, student);
    }
}
