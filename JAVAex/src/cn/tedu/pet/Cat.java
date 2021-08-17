package cn.tedu.pet;
/** 电子宠物小猫类*/
public class Cat extends Pet{
    public Cat(String name, int full, int happy) {
        super(name, full, happy);
    }

    public Cat(String name) {
        super(name);
    }

    @Override
    public String cry() {
        return "喵喵喵";
    }
}
