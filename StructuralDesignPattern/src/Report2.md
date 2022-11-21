# Topic: Structural      Design Patterns.
## Course: Software design techniques
## Author: Craevscaia Valentina

# Theory
The best techniques employed by experienced object-oriented software engineers
are represented by design patterns. Design patterns are solutions to common issues
that software developers ran across when creating new applications. Many software
developers over a sizable period of time came up with these solutions through trial and error.

One type of the design pattern that will be implemented in this laboratory work is Structural
Design Pattern. Structural design patterns are concerned with how classes and objects can be composed, 
to form larger structures. The structural design patterns simplifies the structure by identifying 
the relationships. These patterns focus on, how the classes inherit from each other and how they 
are composed of other classes.

Types of Structural design patterns are:
1. **Adapter Pattern**. A structural design pattern that adapts an interface into another according to 
     client expectation.
2. **Bridge Pattern**. A structural design pattern that separates abstraction (interface) from implementation.
3. **Composite Pattern**. A structural design pattern that allows clients to operate on hierarchy of objects.
4. **Decorator Pattern**. A structural design pattern that adds functionality to an object dynamically.
5. **Facade Pattern**. A structural design pattern that provides an interface to a set of interfaces.
6. **Flyweight Pattern** . A structural design pattern that reuses an object by sharing it.
7. **Proxy Pattern**. A structural design pattern that is used to represent another object.

# Objectives:
1. Study and understand the Structural Design Patterns.
2. Choose a domain, define its main classes/models/entities and
   choose the appropriate instantiation mechanisms.
3. Use some structural design patterns for object instantiation in a sample project.

# Implementation description
To start with,this project is based on banking system. It is aim to present the structure of bank 
and client communication and the services that this provides to its customers . 
Further the implementation is based on how to manipulate with these classes, and what relations it could have.


### Adapter Pattern
Firstly the Adapter Pattern was implemented. This patterns converts the interface of a class into another 
interface that a client wants. In other words, it provides the interface according to client requirement
To start with, a target interface ICard was created with two methods giveBankDetails() and getCreditCard().
This is the desired interface class which will be used by the clients.

````
public interface ICard {
    public void giveBankDetails();
    public String getCreditCard();
}
  
````
Further the adaptee class BankDetails was implemented. This is the class which is used by the Adapter class 
to reuse the existing functionality and modify them for desired use.

````
public class BankDetails {
private String bankName;
private String accHolderName;
private long accNumber;

    public String getBankName() {
        return bankName;
    }
    public void setBankName(String bankName) {
        this.bankName = bankName;
    }
    public String getAccHolderName() {
        return accHolderName;
    }
    public void setAccHolderName(String accHolderName) {
        this.accHolderName = accHolderName;
    }
    public long getAccNumber() {
        return accNumber;
    }
    public void setAccNumber(long accNumber) {
        this.accNumber = accNumber;
    }
}

````
We continue by creating the adapter class BankCustomer. This class is a wrapper class which implements 
the desired target interface and modifies the specific request available from the Adaptee class.

````
public class BankCustomer extends BankDetails implements ICard {
    @Override
    public void giveBankDetails() {
        try{
            BufferedReader br=new BufferedReader(new InputStreamReader(System.in));

            System.out.print("Enter the account holder name :");
            String customername=br.readLine();
            System.out.print("\n");

            System.out.print("Enter the account number:");
            long accno=Long.parseLong(br.readLine());
            System.out.print("\n");

            System.out.print("Enter the bank name :");
            String bankname=br.readLine();

            setAccHolderName(customername);
            setAccNumber(accno);
            setBankName(bankname);
        }catch(Exception e) {
            e.printStackTrace();
        }

    }

    @Override
    public String getCreditCard() {
        long accno=getAccNumber();
        String accholdername=getAccHolderName();
        String bname=getBankName();

        return ("The Account number "+accno+" of "+accholdername+" in "
                + bname+ " bank is valid and authenticated for issuing the credit card. ");
    }
}
````
And finally the client class Adapter Pattern, this class will interact with the Adapter class.

````
public class AdapterPattern {
    public static void main(String args[]){
        ICard targetInterface = new BankCustomer();
        targetInterface.giveBankDetails();
        System.out.print(targetInterface.getCreditCard());
    }
}
````

### Bridge Pattern
Secondly, the Bridge Pattern was implemented. This pattern enables the separation of implementation 
from the interface. It improves the extensibility and  allows the hiding of implementation details from the client.
To start with, the IQuestionAboutCreditCard interface was created.

````
public interface IQuestionAboutCreditCard {
public void newQuestion(String q);
public void deleteQuestion(String q);
public void displayQuestion();
public void displayAllQuestions();
}
````
We continue with the implementation of ClientQuestions class that implements IQuestionAboutCreditCard.

````
public class ClientQuestions implements IQuestionAboutCreditCard {

    private List<String> questions = new ArrayList<String>();
    private int current = 0;

    public ClientQuestions(){
        questions.add("What is a credit card?");
        questions.add("How to open a card?");
        questions.add("How do credit cards work? ");
        questions.add("Can you buy a car with a credit card? ");

    }

    @Override
    public void newQuestion(String newQuestion) {
        questions.add(newQuestion);
    }

    @Override
    public void deleteQuestion(String deletedQuestion) {
        questions.remove(deletedQuestion);
    }

    @Override
    public void displayQuestion() {
        System.out.println( questions.get(current) );
    }

    @Override
    public void displayAllQuestions() {
        for (String quest : questions) {
            System.out.println(quest);
        }
    }
}
````
The QuestionManager class will use ClientQuestion interface which will act as a bridge(QuestionManager).

````
public class QuestionManager {
    protected IQuestionAboutCreditCard questionCreditCard;
    public String frequentAskedQuestions;
    public QuestionManager(String frequentAskedQuestions) {
        this.frequentAskedQuestions = frequentAskedQuestions;
    }

    public void newOne(String question) {
        questionCreditCard.newQuestion(question);
    }
    public void delete(String question) {
        questionCreditCard.deleteQuestion(question);
    }
    public void display() {
        questionCreditCard.displayQuestion();
    }
    public void displayAll() {
        System.out.println("Question Paper: " + frequentAskedQuestions);
        questionCreditCard.displayAllQuestions();
    }
}
````
Below is represented the Bridge pattern.

````
public class BridgePattern {
    public static void main(String[] args) {
        QuestionManager questions = new QuestionManager("Frequent asked questions");
        questions.questionCreditCard = new ClientQuestions();
        questions.newOne("How secure is credit card ?");
        System.out.println();
        questions.displayAll();
    }
}

````
### Decorator Pattern
This pattern says that just "attach a flexible additional responsibilities to an object dynamically".
In other words, The Decorator Pattern uses composition instead of inheritance to extend the 
functionality of an object at runtime. To present this pattern 2 new classes were added the CreditCard and DebitCard 
that extends the CreditCardDecorator class.

The CreditCardDecorator class implements the ICredit interface and override its all methods.
Now it has the ability to decorate some more cards, in our case the CreditCard and the DebitCard.

````
public class CreditCardDecorator implements ICard {
    private ICard newCard;

    public CreditCardDecorator(ICard newCard)  {
        this.newCard = newCard;
    }
    @Override
    public void giveBankDetails() {
        System.out.println("Bank details");
    }

    @Override
    public String getCreditCard() {
        return newCard.getCreditCard();
    }
}
````
Continue with the creation of concrete classes like DebitCard that extends the decorator class and override 
it's all methods.

````
public class DebitCard extends CreditCardDecorator {
    public DebitCard(ICard newCard) {
        super(newCard);
    }

    public void giveBankDetails() {
        System.out.println("Debit card for new clients");
    }

    public String getCreditCard() {
        return super.getCreditCard();
    }
}
````
### Facade Pattern
A Facade Pattern says that just "just provide a unified and simplified interface 
to a set of interfaces in a subsystem, therefore it hides the complexities of the subsystem from the client".
Here two new classes were created the GoldCard and the PlatinumCard that implements the ICard interface.

````
public class PlatinumCard implements ICard {

    private int years;
    public PlatinumCard(int years) {
        this.years = years;
    }
    @Override
    public void giveBankDetails() {
        System.out.println("Platinum card options");
    }

    @Override
    public String getCreditCard() {
        return null;
    }
}

````
Then the CardGiverBranch concrete class was created and this class uses the ICard interface. 

````
public class CardGiverBranch {
private ICard goldCard;
private ICard platinumCard;

    public CardGiverBranch(){
        goldCard = new GoldCard();
        platinumCard = new PlatinumCard(5);
    }

    public void goldCardSpecialOffer(){
        goldCard.getCreditCard();
    }
    public void platinumCardSpecialOffer(){
        platinumCard.getCreditCard();
    }

}
````
Now, we could create a client class in our case the FacadeMain that can obtain a card 
from ICard through a representative as CardGiverBranch.

### Proxy Pattern
Proxy means an object representing another object. A Proxy Pattern "provides the control 
for accessing the original object". It provides the protection to the original object from the outside world.

We already have our ICard interface created before. Further we create a new class called EmployeeCardAccess class
that implements ICard interface for granting the permission to the specific employee that can provide the service.

````
public class EmployeeCardAccess implements ICard {
    private String employeeName;
    private PlatinumCard  platinumCard;

    public void PlatinumCard(String employeeName) {
        this.employeeName = employeeName;
    }
    @Override
    public void giveBankDetails() {

    }

    @Override
    public String getCreditCard() {
        return null;
    }
}

````
Further we create a ProxyCardAccess class that will implement ICard interface for providing the object of 
EmployeeCardAccess class. 

````
public class ProxyCardAccess implements ICard {
    private String employeeName;
    private EmployeeCardAccess  employeeAccess;
    public ProxyCardAccess(String employeeName) {
        this.employeeName = employeeName;
    }
    @Override
    public void giveBankDetails() {
        System.out.println("These is secured bank information");
    }

    @Override
    public String getCreditCard() {
        return null;
    }
}

````
Finally, we created the client class ProxyMain that can access the card.

````
public class ProxyMain {
    public static void main(String[] args) {
        ICard newCardClient = new ProxyCardAccess("Ana Ciubotaru");
        newCardClient.getCreditCard();
    }
}

````

### Conclusion

To sum up, Structural design patterns enabling you to  explain how to assemble objects 
and classes into larger structures, while keeping these structures flexible and efficient.
Structural design patterns are concerned with how classes and objects can be composed, 
to form larger structures.