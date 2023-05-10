package shuzu;

/**
 * @author 余胜军
 * @ClassName ArrayDemo08
 * @qq 644064779
 * @addres www.mayikt.com
 * 微信:yushengjun644
 */
public class ArrayDemo08 {
    public static void main(String[] args) {
//        // 定义2个变量
        int a = 20;
        int b = 30;

        //获取两个数中的最大值
        int max = a > b ? a : b;
        //输出最大值
        System.out.println(max);

        int c = 20;
        int d = 5;

        //获取两个数中的最大值
        int max1 = c > d ? c : d;
        //输出最大值
        System.out.println(max1);
//        max(10, 20);
//        max(10, 30);
//        max(5, 1);
    }

    /**
     * 定义一个方法
     *
     * @param a
     * @param b
     */
    public static void getMax() {
        int a = 10;
        int b = 20;
        //获取两个数中的最大值
        int max = a > b ? a : b;
        //输出最大值
        System.out.println(max);
    }

    public static void mayiktNumber() {
        int number = 10;
        if (number % 2 == 0) {
            System.out.println(number + ",是偶数");
        } else {
            System.out.println(number + ",是奇数");
        }
    }
}
