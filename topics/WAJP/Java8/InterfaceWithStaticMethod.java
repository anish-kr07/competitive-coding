package WAJP.Java8;

public interface InterfaceWithStaticMethod {
    static void main(String[] args) {
        System.out.println("HI .. This is inside Interface , main(), " + args[0]);
    }
}

class Test implements InterfaceWithStaticMethod {
    public static void main(String[] args) {
        System.out.println("Inside Mina Method");
        InterfaceWithStaticMethod.main(new String[]{"Anish"});
    }
}