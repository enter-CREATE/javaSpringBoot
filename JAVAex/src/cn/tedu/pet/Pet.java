package cn.tedu.pet;
/**创建父类宠物类*/
public class Pet {
    String name;//名字
    int full;//饱食度
    int happy;//快乐度
    //全参构造
    public Pet(String name, int full, int happy) {
        this.name = name;
        this.full = full;
        this.happy = happy;
    }
    //含参构造
    public Pet(String name) {
        //含参中调用全参给饱食度和快乐度设置初始值为50
        this(name,50,50);
    }
    //创建电子宠物的喂养功能
    public void feed(){
        if(full == 100){//喂养前先判断,如果吃饱了,就不喂
            System.out.println(name+"已经吃饱啦,不要再喂啦");
            return;//我们使用return关键字结束方法
        }
        System.out.println("给"+name+"喂食");
        full += 10;//饱食度+10
        System.out.println("饱食度:"+full);
    }
    //创建电子宠物的互动玩功能
    public void play(){
        if (full == 0){
            System.out.println(name+"已经饿得玩不动了");
            return;
        }
        System.out.println("陪"+name+"开心的玩耍");
        happy += 10;//快乐+10
        full -= 10;//饱食度-10
        System.out.println("快乐度："+happy);
        System.out.println("饱食度："+full);
    }
    //创建电子宠物的惩罚功能
    public void punish(){
        System.out.println("打"+name+"的pp，哭声："+cry());
        happy -= 10;
        System.out.println("快乐度："+happy);
    }
    //创建电子宠物的哭功能
    public String cry(){
        return "此处有哭叫声";
    }
}
