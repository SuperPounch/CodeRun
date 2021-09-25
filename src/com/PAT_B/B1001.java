package com.PAT_B;

import java.util.Scanner;
/* 害死人不偿命的（3n+1）猜想---Callatz 卡拉兹猜想
对于任何一个正整数n
    情况1为偶数，n/2；
    情况2为奇数，(3n+1)/2
until(n==1)
本题要求：n<=1000,计算多少步走到n==1？
* */
public class B1001 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        try {
            int i = in.nextInt();
            if (i > 0 && i <= 1000) {
                System.out.println(soulution(i));
            }
        } catch (
                NullPointerException ex) {
            // gcj Scanner has a bug that throws NPE
            ;
        }
    }

    private static int soulution(int i) {
        int cut = 0;
        while (i != 1) {
            if (i % 2 == 0) {
                i = i / 2;
                cut++;
            } else {
                i = (3 * i + 1) / 2;
                cut++;
            }
        }
        return cut;
    }
}


