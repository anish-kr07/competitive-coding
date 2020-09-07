package DesignPattern.Builder;

public class LunchOrderBuilderMain {
    public static void main(String args[]){

        LunchOrderBuilder.Builder builder = new LunchOrderBuilder.Builder();
        builder.bread("wheat").condiments("lettuce").dressing("mustard honey").meat("ham");

        //calls build() with no parameters, build() calls parametrized constructor of LunchOrderBuilder(this)
        LunchOrderBuilder lunchOrder = builder.build();

        System.out.println(lunchOrder.getBread());
        System.out.println(lunchOrder.getCondiments());
        System.out.println(lunchOrder.getDressing());
        System.out.println(lunchOrder.getMeat());
    }
}
