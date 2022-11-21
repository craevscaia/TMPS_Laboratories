package AdapterDecoratorFacadeProxy.FacadeProxy;

import AdapterDecoratorFacadeProxy.ICard;

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
