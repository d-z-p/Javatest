package shuzu;
/**
 * @author 余胜军
 * @ClassName ArrayDemo09
 * @qq 644064779
 * @addres www.mayikt.com
 * 微信:yushengjun644
 */
public class ArrayDemo09 {
    public static void main(String[] args) {
        // 1.定义一个数组存放身高
        int[] arr = {151, 150, 170, 162, 131, 168, 192};
        // 临时保存的最大值
        int max = arr[0];// 临时最大值151
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > max) {
                // 修改临时保存的max值
                max = arr[i];
            }
        }
        // 输出最大值
        System.out.println("数组中最大的值：" + max);
    }
}
