package MediatorPattern;

public interface IStudentChat {
    public void sendMessage(String msg, Student student);
    void addStudent(Student student);
}
