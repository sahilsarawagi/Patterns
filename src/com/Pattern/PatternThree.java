package com.Pattern;

public class PatternThree {
    public static void main(String[] args) {
        for (int y = 1; y <= 5; y++) {
            for (int x = 1; x <=6-y  ; x++) {
                System.out.print("*");
            }
            System.out.println();
        }

    }
}
