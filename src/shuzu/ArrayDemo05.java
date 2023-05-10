package shuzu;
/**
 * @author 余胜军
 * @ClassName ArrayDemo05
 * @qq 644064779
 * @addres www.mayikt.com
 * 微信:yushengjun644
 */
public class ArrayDemo05 {
    /*
    * 静态初始化:初始化时指定每个数组元素的初始值，由系统决定数组长度
      格式：数据类型[] 数组名 = new 数据类型[]{元素1,元素2,元素3,...};
      举例：int[] arr = new int[]{1,2,3};
     简化格式：数据类型[] 数组名 = {元素1,元素2,元素3,...};
     int[] arr = {1,2,3};

    * */
    public static void main(String[] args) {
        // 静态初始化数组
//        int[] arr = new int[]{1, 2, 3};
        // 精简写法:
        int[] arr = {1, 2, 3};
        System.out.println(arr);
        System.out.println(arr[0]);// 1
        System.out.println(arr[1]);//2
        System.out.println(arr[2]);// 3
    }
}
