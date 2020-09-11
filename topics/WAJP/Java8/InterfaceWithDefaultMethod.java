package WAJP.Java8;

interface Left {
    default void m(){
        System.out.println("Left Interface");
    }
}
interface Right {
    default void m(){
        System.out.println("Right Interface");
    }
}
public class InterfaceWithDefaultMethod implements Left,Right {
    @Override
    public void m() {
        System.out.println("Inside main class");
        Left.super.m();
        Right.super.m();
    }

    public static void main(String[] args) {
        InterfaceWithDefaultMethod obj = new InterfaceWithDefaultMethod();
        obj.m();

    }

}
