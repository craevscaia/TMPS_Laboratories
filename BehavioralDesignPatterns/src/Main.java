import CommandPattern.CommandInvoker;
import CommandPattern.ICommand;
import CommandPattern.SendMsgCommand;
import MediatorPattern.IStudentChat;
import MediatorPattern.NewStudent;
import MediatorPattern.Student;
import MediatorPattern.StudentChat;
import StrategyPattern.Context;
import StrategyPattern.HappyReaction;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) {
        IStudentChat chat = new StudentChat();

        Student student1 = new NewStudent(chat, "Ana");
        Student student2 = new NewStudent(chat, "Ina");

        chat.addStudent(student1);
        chat.addStudent(student2);

        student1.onLine();
        student2.offLine();

        System.out.println(student1.getName() +  " is currently " + student1.getState());


    }
}