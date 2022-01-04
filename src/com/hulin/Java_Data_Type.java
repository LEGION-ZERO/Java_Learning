package com.hulin;
//java学习包
//通常，一个公司使用它互联网域名的颠倒形式来作为它的包名.例如：互联网域名是 runoob.com，所有的包名都以 com.runoob开头

//以下注释类型为java特有的文档注释(/** */)，后面可通过javadoc输出文档
//补充：JDK中javac.exe用于编译,java.exe用于运行,javadoc.exe用于文档输出

/**
 * 第一部分：java数据类型学习
 * 一、Java四大数据类型共8种
 * 1、整型byte 、short 、int 、long
 * 2、浮点型float 、 double
 * 3、字符型char
 * 4、布尔型boolean
 */
public class Java_Data_Type {

    public static void main(String[] args) {
        // write your code here

        //System.out.println()输出并换行  快捷方式：sout+Tab
        System.out.println("Part1:Java基础数据类型学习");

        //字节,8bit 范围-2^7~2^7-1,有一位时符号位，以下类型相同
        byte by = 120;
        System.out.println("byte：" + by);

        //字符类型,2字节(16bit)  范围：-2^15~2^15-1
        char ch = 'A';
        System.out.println("char：" + ch);

        //短整型,2字节(16bit)  范围：-2^15~2^15-1
        short sh = 97;
        System.out.println("short：" + sh);

        //整形，4字节  范围-2^31~2^31-1
        int in = 2147483647;
        System.out.println("int：" + in);

        //长整形,L结尾,8字节 范围-2^63~2^63-1
        long l = 9223372036854775807L;
        System.out.println("long:" + l);

        //float,f结尾，可省略，可表示8位小数
        //double,d结尾，可省略，可表16位小数
        float f = 1.1234567890123456f;
        double ff = 1.1234567890123456;
        System.out.println("float:" + f);
        System.out.println("double:" + ff);

        //boolean,布尔型，存true和false
        boolean yes = true;
        System.out.println("boolean:" + yes);

        //字符串类型,不属于基础类型
        String str = "hello";
        System.out.println("字符串String:" + str);

        //常量final也不属于基础类型
        final double PI = 3.1415926;
        System.out.println("常量final:" + PI);
    }
}
