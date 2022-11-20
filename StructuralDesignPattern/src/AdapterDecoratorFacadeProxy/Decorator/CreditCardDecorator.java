package AdapterDecoratorFacadeProxy.Decorator;

import AdapterDecoratorFacadeProxy.ICard;

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
