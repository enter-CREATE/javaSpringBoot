package cn.tedu;

public class java01 {
    public static void main(String[] args) {
        int even_sum=0;//偶数和
        int sum=0;//元素和
        int num=0;//偶数个数
        for (int i=1;i<=100;i++){
            sum+=i;
            if (i%2==0){
                even_sum+=i;
                num++;
            }
        }
        System.out.println("1-100的元素之和为："+sum);
        System.out.println("1-100的偶数之和为："+even_sum);
        System.out.println("1-100的偶数个数为："+num);
    }
}
