package shuzu;

/**
 * @author 余胜军
 * @ClassName ArrayDemo03
 * @qq 644064779
 * @addres www.mayikt.com
 * 微信:yushengjun644
 */
public class ArrayDemo03 {
    public static void main(String[] args) {
        //定义两个数组
        int[] arr1 = new int[2];
        int[] arr2 = new int[4];
        //分别输出数组名称和元素
        System.out.println(arr1);
        System.out.println(arr1[0]);
        System.out.println(arr1[1]);
        System.out.println(arr2);
        System.out.println(arr2[0]);
        System.out.println(arr2[1]);
        // 修改数组中元素值
        arr1[0] = 100;
        arr2[0] = 500;
        System.out.println(arr1);
        System.out.println(arr1[0]);
        System.out.println(arr2);
        System.out.println(arr2[0]);
    }
}
