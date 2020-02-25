package DesignPattern.AbstractFactory;

public class AbstractFactoryMain {
    public static void main(String[] args) {
        CreditCardFactory abstractFactory = CreditCardFactory.getCreditCardFactory(1000);
        CreditCard cardFactory = abstractFactory.getCreditCard(CardType.PLATINUM);
        Validator cardValidator = abstractFactory.getValidator(CardType.PLATINUM);

        System.out.println(cardFactory.getClass());
        System.out.println(cardValidator.getClass());

        abstractFactory = CreditCardFactory.getCreditCardFactory(500);
        CreditCard cardFactory2 = abstractFactory.getCreditCard(CardType.GOLD);
        Validator cardValidator2 = abstractFactory.getValidator(CardType.GOLD);

        System.out.println(cardFactory2.getClass());
        System.out.println(cardValidator2.getClass());
    }
}
