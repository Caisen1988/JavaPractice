package com.company.day03;

/**
 * 相同点：& 与 && 结果是一样的，符号左边是true结构也是一样的
 * 不同点：符号左边是false &右边会执行  && 右边不会执行
 */

public class compareTest {
    public static void main(String[] args){
        //区分& 与 &&
        boolean b1 = true;
        b1 = false;
        int num1 = 10;
        if(b1 & (num1++ > 0)){
            System.out.println("I'm in nanjing");
        }else{
            System.out.println("I'm in Beijing");
        }
        System.out.println(num1);
        boolean b2 = true;
        b2 = false;
        int num2 = 10;
        if(b2 && (num2++ > 0)){
            System.out.println("I'm in nanjing");
        }else{
            System.out.println("I'm in Beijing");
        }
        System.out.println(num2);
    }
}


package com.company.day04;

/**
 * 从键盘获取不同类型的变量
 * 1. 导入包
 */
import  java.util.Scanner;
public class ScannerTest {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("输入您的姓名");
        String name = sc.next();
        System.out.println(name);

        System.out.println("输入您的年龄");
        Integer age = sc.nextInt();
        System.out.println(age);

        System.out.println("输入您的体重");
        Double weight = sc.nextDouble();
        System.out.println(weight);

        System.out.println("是否相中");
        Boolean isLove = sc.nextBoolean();
        System.out.println(isLove);
    }
}

