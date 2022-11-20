package AdapterDecoratorFacadeProxy.FacadeProxy;

import AdapterDecoratorFacadeProxy.ICard;

public class FiveYearsServiceProxy implements ICard {
    private int years;
    private PlatinumCard  platinumCard;

    public void PlatinumCard(int years) {
        this.years = years;
    }
    @Override
    public void giveBankDetails() {

    }

    @Override
    public String getCreditCard() {
        return null;
    }
}
