package cn.tedu.pet;

import java.util.Random;
import java.util.Scanner;

/** 本类用于测试电子宠物类*/
public class TestPet {
    public static void main(String[] args) {
        System.out.println("请选择你想养的动物:");
        System.out.println("1:猫");
        System.out.println("2:狗");
        System.out.println("请选择数字:>");
        int c = new Scanner(System.in).nextInt();
        System.out.println("请给你的宠物起个名字:");
        String n = new Scanner(System.in).nextLine();
        //定义局部变量
        Cat cat = null;
        Dog dog = null;
        if (c == 1){
            cat = new Cat(n);
            play(cat);
        }else{
            dog = new Dog(n);
            play(dog);
        }
    }

    private static void play(Cat cat) {
        System.out.println("按回车键继续：");
        while (true){
            new Scanner(System.in).nextLine();
            int r = new Random().nextInt(5);
            switch (r){
                case 0 :cat.feed();break;
                case 1 :cat.play();break;
                default:cat.punish();break;
            }
        }
    }
    private static void play(Dog dog){
        System.out.println("按回车继续:");
        while(true){
            new Scanner(System.in).nextLine();
            int r = new Random().nextInt(5);
            switch (r){
                case 0 :dog.feed();break;
                case 1 :dog.play();break;
                default:dog.punish();break;
            }
        }
    }
}
