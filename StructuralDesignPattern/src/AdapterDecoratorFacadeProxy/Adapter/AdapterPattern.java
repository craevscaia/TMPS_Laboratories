package AdapterDecoratorFacadeProxy.Adapter;

import AdapterDecoratorFacadeProxy.ICard;

public class AdapterPattern {
    public static void main(String args[]){
        ICard targetInterface = new BankCustomer();
        targetInterface.giveBankDetails();
        System.out.print(targetInterface.getCreditCard());
    }
}
