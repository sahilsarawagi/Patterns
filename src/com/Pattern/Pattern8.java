package com.Pattern;

public class Pattern8 {
    public static void main(String[] args) {
        int n = 5;
        for (int y = 1; y <= n; y++) {
            for (int totalspace = 1; totalspace <= n-y; totalspace++) {
                System.out.print(" ");
            }
            for (int x = 1; x <=2*y-1  ; x++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
