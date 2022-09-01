package com.Pattern;

public class Pattern16 {
    static int binomialCoeff(int n, int k) {
        int res = 1;
        if (k > n - k)
            k = n - k;
        for (int i = 0; i < k; ++i)
        {
            res *= (n - i);
            res /= (i + 1);
        }
        return res;
    }
    public static void main(String[] args) {
        int n = 5;
        for (int y = 1; y <= n; y++) {
            for (int totalspace = 1; totalspace <= n-y; totalspace++) {
                System.out.print(" ");
            }
            for (int x = 1; x <=y ; x++) {
                 System.out.print(binomialCoeff(y-1,x-1) +" ");
            }
            System.out.println();
        }
    }
}
