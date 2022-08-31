package com.Pattern;

public class Pattern15 {
    public static void main(String[] args) {
        int n = 5;
        for (int y = 1; y <= 2*n-1; y++) {
            int totalStars= y<=n ? 2*y-1 : 19-2*y;
            int totalSpaces= y<=n ? n-y : y-n;
            for (int totalSpace = 1; totalSpace <= totalSpaces; totalSpace++) {
                System.out.print(" ");
            }
            for (int x = 1; x <=totalStars; x++) {
                if (x!=1 && x!=2*y-1 && x!=19-2*y){
                    System.out.print(" ");
                }else {
                    System.out.print("*");
                }
            }
            System.out.println();
        }
    }
}
