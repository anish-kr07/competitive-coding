package WAJP;



import java.util.*;

class Geek
{

    String name;
    int id;

    Geek(String name, int id)
    {

        this.name = name;
        this.id = id;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Geek geek = (Geek) o;
        return id == geek.id &&
                Objects.equals(name, geek.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, id);
    }



}

class HasCodeEqualsDemo
{
    public static void main (String[] args)
    {

        // creating two Objects with
        // same state
        Geek g1 = new Geek("aditya", 1);
        Geek g2 = new Geek("aditya", 1);

        Map<Geek, String> map = new HashMap<Geek, String>();
        map.put(g1, "CSE");
        map.put(g2, "IT");

        for(Geek geek : map.keySet())
        {
            System.out.println(map.get(geek).toString());
        }

    }
}

