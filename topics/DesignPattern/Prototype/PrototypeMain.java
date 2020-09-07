package DesignPattern.Prototype;

public class PrototypeMain {
    public static void main(String args[]){
        Registry registry = new Registry();
        Movie movie = (Movie) registry.createItem(Registry.Type.MOVIE);

        System.out.println("******Original Movie Object******");
        System.out.println(movie.getTitle());
        System.out.println(movie.getRuntime());
        System.out.println(movie.getPrice());
        System.out.println(movie.getUrl());
        System.out.println(movie.hashCode());

        Movie anotherMovie = (Movie) registry.createItem(Registry.Type.MOVIE);
        anotherMovie.setTitle("Tujhe Me Rab Dikhta Hain");

        System.out.println("******Changed Movie Object******");
        System.out.println(anotherMovie.getTitle());
        System.out.println(anotherMovie.getRuntime());
        System.out.println(anotherMovie.getPrice());
        System.out.println(anotherMovie.getUrl());
        System.out.println(anotherMovie.hashCode());

        Book book = (Book) registry.createItem(Registry.Type.BOOK);

        System.out.println("******Original Book Object******");
        System.out.println(book.getTitle());
        System.out.println(book.getNumberOfPages());
        System.out.println(book.getPrice());
        System.out.println(book.getUrl());
        System.out.println(book.hashCode());

        Book anotherBook = (Book) registry.createItem(Registry.Type.BOOK);
        anotherBook.setTitle("Madhusala");

        System.out.println("******Changed Book Object******");
        System.out.println(anotherBook.getTitle());
        System.out.println(anotherBook.getNumberOfPages());
        System.out.println(anotherBook.getPrice());
        System.out.println(anotherBook.getUrl());
        System.out.println(anotherBook.hashCode());
    }
}
