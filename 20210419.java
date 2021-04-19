package com.company.day05;

public class SwitchTest {
    public static void main(String[] args){
        int num = 44;
        String size;
        switch (num){
            case 29:
                size = "small";
                break;
            case 44:
                size = "big";
                break;
            default:
                size = "unknow";
                break;
        }
        System.out.println(size);
    }
}

