package DesignPattern.Factory;

public class WebsiteFactory {

    public static Website getWebsite(BuilderMain.WebsiteType websiteType){
        switch (websiteType){
            case BLOG           :       return new Blog();
            case SHOPPING       :       return new Shopping();
            default             :       return null;

        }
    }
}
