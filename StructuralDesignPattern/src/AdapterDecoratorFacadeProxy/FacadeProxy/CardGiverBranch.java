package AdapterDecoratorFacadeProxy.FacadeProxy;

import AdapterDecoratorFacadeProxy.ICard;

public class CardGiverBranch {
    private ICard goldCard;
    private ICard platinumCard;

    public CardGiverBranch(){
        goldCard = new GoldCard();
        platinumCard = new PlatinumCard(5);
    }

    public void goldCardSpecialOffer(){
        goldCard.getCreditCard();
    }
    public void platinumCardSpecialOffer(){
        platinumCard.getCreditCard();
    }

}
