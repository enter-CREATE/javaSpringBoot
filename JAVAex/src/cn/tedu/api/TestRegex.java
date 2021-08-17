package cn.tedu.api;

import java.util.Scanner;

/** 本类用于测试正则表达式*/
public class TestRegex {
    public static void main(String[] args) {
        System.out.println("请输入你的身份证号");
        String input = new Scanner(System.in).nextLine();
        //String regex = "[0-9]{17}[0-9X]";
        String regex = "\\d{17}[0-9X]";

        if (input.matches(regex)){
            System.out.println("恭喜您!输入正确!");
        }else{
            System.out.println("输入不正确!请重新输入!");
        }
    }
}
