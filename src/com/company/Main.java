package com.company;

public class Main {

    public static void main(String[] args) {
	    // write your code here
        //数组之和
        int[] ns = new int[5];
        for(int i = 0; i < 5;i++) {
            ns[i] = i+10;
            System.out.println(ns[i]);
        }

        System.out.println(sum1(ns));
    }

    public static int sum1(int[] ns) {
        int sum = 0;
        for(int i = 0 ; i<ns.length; i++) {
            sum = sum + ns[i];
        }
        return sum;
    }
}
