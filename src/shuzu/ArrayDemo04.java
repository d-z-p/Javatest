package shuzu;

/**
 * @author 余胜军
 * @ClassName ArrayDemo04
 * @qq 644064779
 * @addres www.mayikt.com
 * 微信:yushengjun644
 */
public class ArrayDemo04 {
    public static void main(String[] args) {
        int[] arr1 = new int[2];  // 数组 存放2个元素
        arr1[0] = 100;// index=0 100
        arr1[1] = 200;// index=1 200
        System.out.println(arr1);// arr1内存地址
        System.out.println(arr1[0]); // index=0 100
        System.out.println(arr1[1]);// index=1 200
        int[] arr2 = arr1;//赋值 将arr1的内存地址赋值给arr2
        System.out.println("arr1:" + arr1);
        System.out.println("arr2:" + arr2);
        arr2[0] = 300;
        arr2[1] = 40;
//        System.out.println(arr2);
        System.out.println("arr2[0]:" + arr2[0]);
//        System.out.println(arr2[1]);
        System.out.println("arr1[0]:" + arr1[0]);
    }
}
