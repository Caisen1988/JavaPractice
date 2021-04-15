public static void main(String[] args){
        int num = 187;
        int bai = num / 100;
        int shi =  num % 100 / 10;
        int ge = num % 10;
        System.out.println("bai = " + bai);
        System.out.println("shi = " + shi);
        System.out.println("ge = " + ge);
    }

public static void main(String[] args){
        //除法
        int num1 = 12;
        int num2 = 5;
        //2
        System.out.println(num1/num2);
        int result = num1 / num2 * num2;
        //10
        System.out.println(result);
        double result2 = num1/num2;
        //2.0
        System.out.println(result2);
        double result3 = (double)num1/num2;
        System.out.println(result3);//2.4
        double result4 = (double)(num1/num2);
        System.out.println(result4);//2.0

        //趋于运行，
        //结构的符号与分子一样
        int m1 = 12;
        int n1 = 5;
        System.out.println(m1%n1);
        int m2 = -12;
        int n2 = -5;
        System.out.println(m2%n2);
        int m3 = -12;
        int n3 = 5;
        System.out.println(m3%n3);
        int m4 = 12;
        int n4 = -5;
        System.out.println(m4%n4);

        //前++ 后++ 不会改变本身变量类型
        short s1 = 10;
        //s1 = s1 + 1; //编译不通过
        ++s1;
        System.out.println(s1);

        byte b1 = 127;
        b1++;
        System.out.println(b1);
    }


public static void main(String[] args){
        int i1, i2;  //使用逗号
        short s1 = 2;
        //s1 = s1 + 2; 编译报错
        s1 += 2; //不会改变变量的数据类型
        System.out.println(s1);
    }
