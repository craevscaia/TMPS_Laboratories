package IteratorPattern;

import MediatorPattern.Student;
import MediatorPattern.StudentChat;

import java.util.ArrayList;
import java.util.List;

public class StudentCollection implements IStudentCollection {

    private List<Student> studentsList;

    public StudentCollection(){
        studentsList = new ArrayList<>();
    }

    @Override
    public void addStudent(Student student) {
        this.studentsList.add(student);
    }

    @Override
    public void removeStudent(Student student) {
        this.studentsList.remove(student);
    }

    @Override
    public IIterator iterator(StudentEnum studentName) {
       return new Iterator(studentName, this.studentsList);
    }


}
