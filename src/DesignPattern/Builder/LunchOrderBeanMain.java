package DesignPattern.Builder;

public class LunchOrderBeanMain {
    public static void main(String args[]){

        LunchOrderBean lunchOrderBean = new LunchOrderBean();
        lunchOrderBean.setBread("wheat");
        lunchOrderBean.setCondiments("lettuce");
        lunchOrderBean.setDressing("mustard Honey");
        lunchOrderBean.setMeat("ham");

        System.out.println(lunchOrderBean.getBread());
        System.out.println(lunchOrderBean.getCondiments());
        System.out.println(lunchOrderBean.getDressing());
        System.out.println(lunchOrderBean.getMeat());
    }
}
