package com.Pattern;

public class Pattern2 {
    public static void main(String[] args) {
        for (int y = 1; y <= 5; y++) {
            for (int x = 1; x <=y  ; x++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
