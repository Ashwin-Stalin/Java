package com.spaceAndTimeComplexity;

public class Fibonacci {
    public static void main(String[] args){
        int ans = fibo(10);
        System.out.println(ans);
    }

    static int fibo(int n){
        if (n < 2){
            return n;
        }
        return fibo(n-1) + fibo(n-2);
    }
}