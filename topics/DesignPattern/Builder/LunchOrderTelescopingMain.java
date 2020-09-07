package DesignPattern.Builder;

public class LunchOrderTelescopingMain {
    public static void main(String args[]){

        LunchOrderTelescopingConstructor lunchOrder =
                new LunchOrderTelescopingConstructor("wheat","lettuce","mustard honey","ham");

        System.out.println(lunchOrder.getBread());
        System.out.println(lunchOrder.getCondiments());
        System.out.println(lunchOrder.getDressing());
        System.out.println(lunchOrder.getMeat());
    }
}
