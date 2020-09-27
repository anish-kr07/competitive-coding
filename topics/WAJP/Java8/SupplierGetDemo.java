package WAJP.Java8;

import java.util.function.Supplier;

public class SupplierGetDemo {
    public static void main(String[] args) {
        Supplier<String> supplier = () ->{
            String otp = "";
            for (int i = 0; i < 6; i++) {
                otp += (int)(Math.random()*10);
            }
            return otp;
        };
        System.out.println("OTP : "+ supplier.get());
        System.out.println("OTP : "+ supplier.get());
        System.out.println("OTP : "+ supplier.get());
        System.out.println("OTP : "+ supplier.get());
        System.out.println("OTP : "+ supplier.get());
    }
}
