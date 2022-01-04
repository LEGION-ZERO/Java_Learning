package com.hulin;

import java.io.UnsupportedEncodingException;
import java.nio.charset.StandardCharsets;
import java.util.Locale;

public class Java_String {
    public static void main(String[] args) {
        String str = "hello,你好,胡林！WORLD";

        //length 返回值为int类型。得到一个字符串的字符个数（中、英、空格、转义字符皆为字符，计入长度
        System.out.println("字符串长度:" + str.length());

        //charAt 返回值为char类型。得到一个字符串的字符个数（中、英、空格、转义字符皆为字符，计入长度
        char ch = str.charAt(2);
        System.out.println("第3个字符为:" + ch);
        ch = str.charAt(6);
        System.out.println("第6个字符为:" + ch);

        //getBytes 使用指定的字符集将字符串编码为 byte 序列，并将结果存储到一个新的 byte 数组中。
        try{
            byte[] Str2 = str.getBytes();
            System.out.println("默认编码返回值：" + Str2 );

            Str2 = str.getBytes(StandardCharsets.UTF_8);
            System.out.println("UTF8编码返回值：" + Str2 );

            Str2 = str.getBytes( StandardCharsets.ISO_8859_1);
            System.out.println("ISO_8859_1编码返回值：" + Str2 );
        } catch ( Exception e){
            System.out.println("不支持的字符集");
        }

        //toLowerCase(),字符串变小写  toUpperCase()变大写
        System.out.println(str.toLowerCase());
        System.out.println(str.toUpperCase());

    }
}
