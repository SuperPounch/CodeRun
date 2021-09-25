package com.PAT_B;

import java.util.Scanner;

import static java.sql.DriverManager.println;

/*
得到“答案正确”的条件是：
字符串中必须仅有 P、 A、 T这三种字符，不可以包含其它字符；
任意形如 xPATx 的字符串都可以获得“答案正确”，其中 x 或者是空字符串，或者是仅由字母 A 组成的字符串；
如果 aPbTc 是正确的，那么 aPbATca 也是正确的，其中 a、 b、 c 均或者是空字符串，或者是仅由字母 A 组成的字符串。
*/
public class B1003 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        String k = in.nextLine();//获得的是enter键
        while (n > 0) {
            //pat字母的"前中后"的字符个数
            int q = 0, z = 0, h = 0;//统计"前中后"三段段A的个数
            int p = 0, a = 0, t = 0;//统计字符"P","A","T"的个数
            int f = 1; // 1 前 2 中 3 后
            boolean flag = false; //其他字符 是否存在 存在

            String str = in.nextLine();//读取第一行字符串
            char[] chars = str.toCharArray();
            for (int i = 0; i < chars.length; i++) {
                if (chars[i] == 'P') {
                    p++;
                    f = 2;//进入中间段
                } else if (chars[i] == 'A') {
                    a++;
                } else if (chars[i] == 'T') {
                    t++;
                    f = 3;//进入末尾段
                } else {
                    flag = true;//存在其他字符
                  /*  System.out.println("NO");
                    n--;
                    break;*/
                }
                switch (f) {
                    case 1:
                        q++;
                        break;
                    case 2:
                        if (chars[i] != 'P') {
                            z++;
                        }
                        break;
                    case 3:
                        if (chars[i] != 'T') {
                            h++;
                        }
                        break;
                }
            }
            if (p == 1 && a != 0 && t == 1 && q * z == h && !flag&&z!=0) {//z==0时，影响q*z==h的判断
                System.out.println("YES");
            } else {
                System.out.println("NO");
            }
            n--;
        }
    }
}
