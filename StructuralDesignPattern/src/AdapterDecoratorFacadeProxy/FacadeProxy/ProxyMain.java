package AdapterDecoratorFacadeProxy.FacadeProxy;

import AdapterDecoratorFacadeProxy.ICard;

public class ProxyMain {
    public static void main(String[] args) {
        ICard newCardClient = new ProxyCardAccess("Ana Ciubotaru");
        newCardClient.getCreditCard();
    }
}
