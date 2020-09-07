package DesignPattern.Prototype;

import java.util.HashMap;
import java.util.Map;

public class Registry {
    Map<Enum,Item> itemMap = new HashMap<>();
    public Registry(){
        loadItems();
    }

    public Item createItem(Enum type){
      Item item = null;
      try {
          item = (Item) itemMap.get(type).clone();
      }catch ( CloneNotSupportedException e){
          e.printStackTrace();
      }
      return  item;
    }

    private void loadItems(){
        Movie movie = new Movie();
        movie.setTitle("DDLJ");
        movie.setPrice(100.100);
        movie.setRuntime("3 hours");
        itemMap.put(Type.MOVIE,movie);

        Book book = new Book();
        book.setTitle("wings of Fire");
        book.setNumberOfPages(198);
        book.setPrice(120.33);
        itemMap.put(Type.BOOK,book);
    }
    public enum Type {
        MOVIE,
        BOOK,
    }
}
