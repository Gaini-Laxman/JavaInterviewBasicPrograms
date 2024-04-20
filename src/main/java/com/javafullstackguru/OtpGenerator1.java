package com.javafullstackguru;

import java.util.function.Supplier;

public class OtpGenerator1 {
    public static void main(String[] args) {
        Supplier<String> s = () -> {
            String otp = "Your OTP, Never Share to anyone😀 : "+" ";
            for (int i = 1; i <= 6; i++) {
                otp += (int) (Math.random() * 10);
            }
            return otp;
        };
        System.out.println(s.get());
    }
}
