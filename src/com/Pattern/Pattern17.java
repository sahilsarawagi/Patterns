package com.Pattern;

public class Pattern17 {
    public static void printStar(int n){
        for (int x = 1; x <=n; x++) {
            System.out.print("*");
        }
    }
    public static void printSpaces(int n){
        for (int totalSpace = 1; totalSpace <= n; totalSpace++) {
            System.out.print(" ");
        }
    }
    public static void main(String[] args) {
        int n =5;
        for (int y = 1; y <= 2*n; y++) {
            int totalStars= y<=n ? n+1-y : y-n;
            int totalSpaces= y<=n ? 2*y-2 : 4*n-2*y;
            printStar(totalStars);
            printSpaces(totalSpaces);
            printStar(totalStars);
            System.out.println();
        }
    }
}
