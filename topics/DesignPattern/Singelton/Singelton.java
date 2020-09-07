package DesignPattern.Singelton;

public class Singelton {
    //Lazy Loading
    //volatile
    private static volatile Singelton instance = null;

    //avoid Reflection
    private Singelton(){
        if(instance !=null){
            throw new RuntimeException("Create instance using getInstance()");
        }
    }

    public static Singelton getInstance(){
        //Lazy Loading
        if(instance == null){
            //thread-safe
            synchronized (Singelton.class) {
                //if two thread tries to gain lock on this code, check for null again after synchronized
                if(instance == null)
                    instance = new Singelton();
            }
        }
        return instance;
    }
}
