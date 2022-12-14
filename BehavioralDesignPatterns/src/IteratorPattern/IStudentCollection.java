package IteratorPattern;

import MediatorPattern.Student;
import MediatorPattern.StudentChat;

public interface IStudentCollection {
    public void addStudent(Student student);

    public void removeStudent(Student student);

    public IIterator iterator(StudentEnum studentName);
}
