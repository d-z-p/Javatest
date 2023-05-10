package shuzu;

/**
 * @author 余胜军
 * @ClassName ArrayDemo06
 * @qq 644064779
 * @addres www.mayikt.com
 * 微信:yushengjun644
 */
public class ArrayDemo06 {
    public static void main(String[] args) {
        int[] arr = new int[3];
        System.out.println(arr[0]);
        System.out.println(arr[1]);
        System.out.println(arr[2]);
//        System.out.println(arr[3]);
        arr = null; // arr内存地址==null
        System.out.println(arr[0]);
    }
}
