package MediatorPattern;

public class NewStudent extends Student{

    public NewStudent(IStudentChat chat, String name) {
        super(chat, name);
    }

    @Override
    public String send(String msg) {
        System.out.println(this.name+": Sending Message="+msg);
        chat.sendMessage(msg, this);
        return msg;
    }

    @Override
    public void receive(String msg) {
        System.out.println(this.name+": Received Message:"+msg);
    }
}
