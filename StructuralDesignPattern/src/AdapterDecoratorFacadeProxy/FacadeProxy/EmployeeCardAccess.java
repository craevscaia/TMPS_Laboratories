package AdapterDecoratorFacadeProxy.FacadeProxy;

import AdapterDecoratorFacadeProxy.ICard;

public class EmployeeCardAccess implements ICard {
    private String employeeName;
    private PlatinumCard  platinumCard;

    public void PlatinumCard(String employeeName) {
        this.employeeName = employeeName;
    }
    @Override
    public void giveBankDetails() {
        System.out.println("Details about the bank provider");
    }

    @Override
    public String getCreditCard() {
        System.out.println("New platinum card is ready for the client");
        return null;
    }
}
