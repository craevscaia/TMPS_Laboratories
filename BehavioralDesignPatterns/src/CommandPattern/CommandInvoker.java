package CommandPattern;

//This class has the role of the invoker
//asks the command to carry out the request.

public class CommandInvoker {
    private ICommand sendCommand;

    public CommandInvoker(ICommand clickSend) {
        this.sendCommand = clickSend;
    }

    public void clickSend() {
        System.out.println("The message is sent");
    }

}
