package DesignPattern.Singelton;

public class SingeltonMain {
    public static void main(String args[]){
        Singelton instance = Singelton.getInstance();
        System.out.println(instance);
        Singelton anotherInstance = Singelton.getInstance();
        System.out.println(anotherInstance);
    }
}
