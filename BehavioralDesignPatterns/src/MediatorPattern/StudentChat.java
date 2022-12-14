package MediatorPattern;

import java.util.ArrayList;
import java.util.List;

public class StudentChat implements IStudentChat{
    private List<Student> students;
    public StudentChat(){
        this.students = new ArrayList<>();
    }
    @Override
    public void sendMessage(String msg, Student student) {

        for(Student s : this.students){
            //message should not be received by the user sending it
            if(s != student){
                s.receive(msg);
            }
        }
    }

    @Override
    public void addStudent(Student student) {
        this.students.add(student);
    }
}
