package AdapterDecoratorFacadeProxy.FacadeProxy;

import AdapterDecoratorFacadeProxy.ICard;

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
