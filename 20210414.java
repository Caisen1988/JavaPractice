public static void main(String[] args) {
        //float 4个字节 double 8个字节
        //浮点型，表示带小数点的数值
        //float 的范围比long还大
        double d1 = 1234.5F;
        out.println(d1);
        //3. 字符型：char(1字符 = 2个字节),声明一个字符也可以声明转义字符，也可以声明unicode
        char c1 = 'a';
        char c2 = '\n';
        char c3 = '\t';
        char c4 = '\u0043';
        out.println(c4);
        //布尔值
        boolean bb1 = true;
        out.println(bb1);
    }

public static void main(String[] args){
        byte b1 = 2;
        int i1 = 129;
//        byte b2 = b1 + i1;
        int i2 = b1 + i1;
        System.out.println(i2);
        //精度损失
        double d1 = 12.3;
        int i3 = (int) d1;
        System.out.println(i3);

        long l1 = 123L;
        System.out.println((short)l1);

        //float f1 = 12.3; //默认daboule 编译错误

    }


public static void main(String[] args){
        String s1 = "Hello Word";
        System.out.println(s1);

        String s2 = "a";
        String s3 = "";
        //char c = ''; //编译不通过
        char c = 'a';
        int num = 10;
        String str = "hello";
        System.out.println(c + num + str); //107hello
        System.out.println(c + (num + str));//a10hello
        System.out.println(str + c + num);//helloa10
        System.out.println(str + (c + num));//hello107

        String str1 = 4 + "";
        //int num1 = (int)str1; 编译不通过

    }
