package DesignPattern.Factory;

public class WebsiteFactory {

    public static Website getWebsite(Enum websiteType){
        switch (websiteType.toString()){
            case "BLOG"         :       return new Blog();
            case "SHOPPING"     :       return new Shopping();
            default             :       return null;

        }
    }
}
