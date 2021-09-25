package com.PAT_B;

import java.util.Scanner;
/*写出这个数
将一个数字的各位相加，输出结果的拼音
* */
public class B1002 {
    public static void main(String[] args) {
        String str = new Scanner(System.in).nextLine();
        char[] chars = str.toCharArray();
        //技巧1:得到标准输入的结果，转换成char字符数组
        int sum = 0;
        for (int i = 0; i < chars.length; i++) {
            sum += chars[i] - '0';//技巧2:通过-"0"来计算数字之和
        }
        char[] c = (sum + "").toCharArray();//再将结果转换成字符来判断
        boolean flag = false;
        for (int i = 0; i < c.length; ++i) {
            if (flag) {
                System.out.print(" ");
            }
            out(c[i]);
            flag = true;//技巧3：借助for语句内部来解决中间添加空格的要求
        }
    }

    private static void out(char c) {
        switch (c) {
            case '1':
                System.out.print("yi");
                break;
            case '2':
                System.out.print("er");
                break;
            case '3':
                System.out.print("san");
                break;
            case '4':
                System.out.print("si");
                break;
            case '5':
                System.out.print("wu");
                break;
            case '6':
                System.out.print("liu");
                break;
            case '7':
                System.out.print("qi");
                break;
            case '8':
                System.out.print("ba");
                break;
            case '9':
                System.out.print("jiu");
                break;
            case '0':
                System.out.print("ling");
                break;
        }
    }
}
