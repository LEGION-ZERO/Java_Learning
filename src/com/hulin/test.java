package com.hulin;

import java.util.Scanner;

public class test {
    public static void main(String[] args) {
        int num1, num2, sum;
        System.out.print("input a number:");
        Scanner sin = new Scanner(System.in);
        try {
            num1 = sin.nextInt();
            System.out.print("input another number:");
            num2 = sin.nextInt();
            sin.close();
            sum = num1 / num2;
            System.out.println("sum is:" + sum);
        } catch (Exception e) {
            System.out.println("异常:" + e);
        }
    }
}
