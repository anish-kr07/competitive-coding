package DesignPattern.AbstractFactory;

public class AmmexGoldValidator implements Validator {
    @Override
    public boolean isValid(CreditCard creditCard) {
        return false;
    }
}
