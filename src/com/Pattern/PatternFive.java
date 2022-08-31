package com.Pattern;

public class PatternFive {
    public static void main(String[] args) {
        int n=5;
        for (int y = 1; y <= 2*n-1; y++) {
            int totalStars= y<=n ? y : 2*n-y;
            for (int x = 1; x <=totalStars  ; x++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
