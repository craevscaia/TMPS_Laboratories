package MediatorPattern;

import IteratorPattern.StudentCollection;
import StrategyPattern.Context;
import StrategyPattern.HappyReaction;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.concurrent.ExecutionException;

public class MediatorPattern {
    public static void main(String[] args){

        IStudentChat chat = new StudentChat();
        Student student1 = new NewStudent(chat, "Ana");
        Student student2 = new NewStudent(chat, "Ina");
        Student student3 = new NewStudent(chat, "Cornel");
        Student student4 = new NewStudent(chat, "Matei");

        chat.addStudent(student1);
        chat.addStudent(student2);
        chat.addStudent(student3);
        chat.addStudent(student4);

        student2.send("Hi");
        System.out.println(chat);

        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        Context context = new Context(new HappyReaction());
        System.out.println(student1.name  + " reacted to the message " + context.executeStrategy(student2.send("Hi")));
    }
}
