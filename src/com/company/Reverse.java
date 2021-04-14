package com.company;

public class Reverse {
    public void reverseStr(String str) {
        String reStr = "";
        for(int i = 0; i<str.length();i++) {
            reStr = reStr + str.charAt(str.length()-i-1);
        }

        System.out.println(reStr);
    }
}
