package DesignPattern.AbstractFactory;

public class AmmexFactory extends CreditCardFactory{
    @Override
    public CreditCard getCreditCard(CardType cardType) {
        switch (cardType) {
            case GOLD       :   return new AmmexGoldCreditCard();
            case PLATINUM   :   return new AmmexPlatinumCreditCard();
            default         :   return null;
        }
    }

    @Override
    public Validator getValidator(CardType cardType) {
        switch (cardType) {
            case GOLD       :   return new AmmexGoldValidator();
            case PLATINUM   :   return new AmmexPlatinumValidator();
            default         :   return null;
        }
    }
}
