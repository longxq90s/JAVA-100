package com.company;

import java.util.Scanner;

/* 需求：机票价格按照淡季旺季、头等舱和经济舱收费、输入机票原价、月份和头等舱或经济舱。
    按照如下规则计算机票价格：
    旺季（5-10月）头等舱9折，经济舱8.5折，淡季（11月到来年4月）头等舱7折，经济舱6.5折。*/
public class sellTicket {
    public static void main(String[] args) {
        System.out.print("请输入当前机票价格:");
        int price = new Scanner(System.in).nextInt();
        System.out.print("请输入购买月份：");
        int Mon = new Scanner(System.in).nextInt();
        double[] month = selectMonth(Mon);
        System.out.print("请输入您购买机舱座位（1/2）");
        int level = new Scanner(System.in).nextInt() - 1;
        getPrice(level, price, month[level]);
    }

    public static double[] selectMonth(int month) {
        if (4 < month && month < 10) {
            System.out.println(month + "月,头等舱机票打" + 9 + "折");
            System.out.println(month + "月,经济舱机票打" + 8.5 + "折");
            double[] res = {9, 8.5};
            return res;
        } else {
            System.out.println(month + "月,头等舱机票打" + 7 + "折");
            System.out.println(month + "月,经济舱机票打" + 6.5 + "折");
            double[] res = {7, 6.5};
            return res;
        }
    }

    public static void getPrice(int level, int price, double count) {
        String levelSt = level == 0 ? "头等舱" : "经济舱";
        System.out.println(levelSt + "当前出票价格为：" + price * count);

    }
}


