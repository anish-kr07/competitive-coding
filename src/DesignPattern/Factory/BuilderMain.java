package DesignPattern.Factory;

public class BuilderMain {
    public static void main(String[] args) {
        Website blogWebsite = WebsiteFactory.getWebsite(WebsiteType.BLOG);
        System.out.println(blogWebsite.getPages());

        Website shoppingWebsite = WebsiteFactory.getWebsite(WebsiteType.SHOPPING);
        System.out.println(shoppingWebsite.getPages());
    }
    public enum WebsiteType {
        BLOG,
        SHOPPING,
    }
}
