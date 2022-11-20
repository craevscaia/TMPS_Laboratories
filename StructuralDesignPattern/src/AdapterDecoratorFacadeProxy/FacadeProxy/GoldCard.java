package AdapterDecoratorFacadeProxy.FacadeProxy;

import AdapterDecoratorFacadeProxy.ICard;

public class GoldCard implements ICard {
    @Override
    public void giveBankDetails() {
        System.out.println("Gold card options");
    }

    @Override
    public String getCreditCard() {
        return null;
    }
}
