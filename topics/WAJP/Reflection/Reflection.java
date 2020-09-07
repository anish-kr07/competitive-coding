package WAJP.Reflection;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

class Reflection {
    //TODO Look for access specifiers , Reflection can be used irrespective if specifiers
    private  String s;
    public Reflection(){
        s = "Anish";
    }
    public void  method1(){
        System.out.println("The String is  "+s);
    }

    public void method2(int n ){
        System.out.println("The number is "+n);
    }

    private void method3(){
        System.out.println("Reflection is used to access this method");
    }

}

class  ReflectionImplementation {
    public static void main(String[] args) throws Exception{
        Reflection obj = new Reflection();
        //We can grt class , constructor , methods , fields vie Reflection
        Class cls = obj.getClass();
        System.out.println("The name of The class is "+cls.getName());

        Constructor constructor = cls.getConstructor();
        System.out.println("The name is the constructor is "+constructor.getName());

        System.out.println("The methods in "+cls.getName()+" class are : ");

        Method[] methods = cls.getDeclaredMethods();
//        Method[] methods = cls.getMethods();
        for(Method method : methods){
            System.out.println(method.getName());
        }
        Method methodCall2 = cls.getDeclaredMethod("method2", int.class);
        methodCall2.invoke(obj,7);

        //Accessing the private fields and methods
        Field field = cls.getDeclaredField("s");
        field.setAccessible(true);
        field.set(obj,"Anish Kumar");
        Method methodCall1 = cls.getDeclaredMethod("method1");
        methodCall1.invoke(obj);

        //Throws java.lang.IllegalAccessException , set is accessible first
        Method methodCall3 = cls.getDeclaredMethod("method3");
        methodCall3.setAccessible(true);
        methodCall3.invoke(obj);


    }
}
