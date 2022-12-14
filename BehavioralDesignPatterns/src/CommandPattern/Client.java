package CommandPattern;

import MediatorPattern.IStudentChat;
import MediatorPattern.NewStudent;
import MediatorPattern.Student;
import MediatorPattern.StudentChat;

public class Client {
    public static void main(String[] args) {
        IStudentChat chat = new StudentChat();
        String msg = "Hi";
        Student student = new NewStudent(chat, " Ana");

        ICommand clickSend = new SendMsgCommand(chat,msg, student);
        CommandInvoker commandInvoker = new CommandInvoker(clickSend);

        commandInvoker.clickSend();

    }
}
