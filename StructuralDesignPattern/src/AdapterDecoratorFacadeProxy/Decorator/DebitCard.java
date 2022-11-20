package AdapterDecoratorFacadeProxy.Decorator;

import AdapterDecoratorFacadeProxy.ICard;

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
