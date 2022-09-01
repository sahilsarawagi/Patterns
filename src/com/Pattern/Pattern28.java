package com.Pattern;

public class Pattern28 {
    public static void main(String[] args) {
        int n =3;
        for (int y = 1; y <= 2*n-1; y++) {
            int totalStars= y<=n ? 2*y-1 : 4*n-1-2*y;
            int totalSpaces= y<=n ? n-y : y-n;
            for (int totalSpace = 1; totalSpace <= totalSpaces; totalSpace++) {
                System.out.print(" ");
            }
            for (int x = 1; x <=totalStars; x++) {
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
