package com.Pattern;

public class Pattern11 {
    public static void main(String[] args) {
        int n = 5;
        for (int y = 1; y <= n; y++) {
            for (int totalspace = 1; totalspace <= y-1; totalspace++) {
                System.out.print(" ");
            }
            for (int x = 1; x <=2*n + 1 -2*y  ; x++) {
                if (x%2==0){
                    System.out.print(" ");
                }else {
                    System.out.print("*");
                }
            }
            System.out.println();
        }
    }
}
