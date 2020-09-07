package DesignPattern.Factory;

public class Shopping extends Website {

    @Override
    public void createWebsite() {
        pages.add(new CartPage());
        pages.add(new ItemsPage());
        pages.add(new SearchPage());
        pages.add(new CommentPage());
    }
}
