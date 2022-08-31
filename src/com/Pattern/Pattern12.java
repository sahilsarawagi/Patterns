package com.Pattern;

public class Pattern12 {
    public static void main(String[] args) {
        int n = 6;
        for (int y = 1; y <= 2*n; y++) {
            int totalspaces = y<=n ? (y-1) : 2*n-y;
            int totalstars = y<=n ? 2*n + 1 -2*y : 2*y - 2*n-1;
            for (int totalspace = 1; totalspace <= totalspaces; totalspace++) {
                System.out.print(" ");
            }
            for (int x = 1; x <=totalstars ; x++) {
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
