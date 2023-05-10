package shuzu;

/**
 * @author 余胜军
 * @ClassName ArrayDemo7
 * @qq 644064779
 * @addres www.mayikt.com
 * 微信:yushengjun644
 */
public class ArrayDemo07 {
    public static void main(String[] args) {
        int[] arr = {66, 88, 99, 10};
        //arr.length数组中的 元素个数 或者 数组的长度 4
//        System.out.println(arr[0]);
//        System.out.println(arr[1]);
//        System.out.println(arr[2]);
//        System.out.println(arr[3]);
        for (int i = 0; i < arr.length; i++) {
            // i=0
            System.out.println(arr[i]);
            // i=1
            // i=2
            // i=3
        }
        System.out.println("-------");
        int[] arr2 = {66, 88, 99};
//        System.out.println(arr2.length);
        for (int i = 0; i < arr2.length; i++) {
            // i=0
            System.out.println(arr2[i]);
            // i=1
            // i=2
            // i=3
        }
    }
}
