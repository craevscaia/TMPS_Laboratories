package AdapterDecoratorFacadeProxy.Decorator;

import AdapterDecoratorFacadeProxy.ICard;

public class CreditCard extends CreditCardDecorator {
    public CreditCard(ICard newCard) {
        super(newCard);
    }

    public void giveBankDetails() {
        System.out.println("Credit card for new clients");
    }

    public String getCreditCard() {
        return super.getCreditCard();
    }
}
