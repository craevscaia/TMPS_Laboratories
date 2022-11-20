package AdapterDecoratorFacadeProxy.FacadeProxy;

import AdapterDecoratorFacadeProxy.ICard;

public class ProxyMain {
    public static void main(String[] args) {
        ICard newCard = new FiveYearsServiceProxy();
        newCard.getCreditCard();
    }
}
