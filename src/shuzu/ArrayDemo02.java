package shuzu;

import java.util.Arrays;

/**
 * @author 余胜军
 * @ClassName ArrayDemo02
 * @qq 644064779
 * @addres www.mayikt.com
 * 微信:yushengjun644
 */
public class ArrayDemo02 {
    public static void main(String[] args) {
        // new 一个数组 容量是为4 存放四个元素
//        int[] arr = new int[4];
//        System.out.println(arr);// 数组内存地址
//        System.out.println(arr[0]);
//        System.out.println(arr[1]);
//        System.out.println(arr[2]);
//        System.out.println(arr[3]);
        boolean[] booleans = new boolean[4];
        System.out.println(Arrays.toString(booleans));
        System.out.println(booleans);
        System.out.println(booleans[0]);
        System.out.println(booleans[1]);
        System.out.println(booleans[2]);
        System.out.println(booleans[3]);
    }
}
 