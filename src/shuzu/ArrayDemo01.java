package shuzu;

import java.util.Arrays;

/**
 * @author 余胜军
 * @ClassName ArrayDemo01
 * @qq 644064779
 * @addres www.mayikt.com
 * 微信:yushengjun644
 */
public class ArrayDemo01 {
    public static void main(String[] args) {
        //数据类型[] 变量名 = new 数据类型[数组长度];
    	int[] array={1,2,3};
    /*	元素类型[] 数组名 = new 元素类型[元素个数或数组长度];

    	元素类型[] 数组名 = new 元素类型[]{元素，元素，……};

    	元素类型[] 数组名 = {元素，元素，……};*/

    	int[] arr = new int[5];//创建数组第一种方式,此时默认值都是为0
    	System.out.println("数组1:" + arr);
    	Arrays.sort(arr);//将数组按照升序排列
    	System.out.println(Arrays.toString(arr));
    	
    	int[] arr1= new int[]{3,5,1,7};//第二种方式：创建并初始化数组
    	System.out.println("数组2:" + arr1);
    	
    	int[] arr2 = {3,5,1,7};//第三种方式：创建并初始化数组
    	System.out.println("数组3:" + arr2);
        int result = Arrays.binarySearch(arr2, 7);//找对应的下标
    	System.out.println("目标值的角标："+result);

    	
        /**
         *         int[] array = new int[3];
         *左边 int[] array
         * int 数组中的元素是为int数据类型
         * [] 定义数组
         * array 数组的变量名称
         * =
         * new 给数组分配内存空间
         * int 数组中的元素是为int数据类型
         * [3] 3数组的长度[数组的长度] 数组存放元素的个数
         *右边  new int[3];
         * int类型默认值就是为0
         */
        System.out.println("array[0]:" + array[0]);// 对应生活中第1个元素
        System.out.println("array[1]:" + array[1]);// 对应生活中第2个元素
        System.out.println("array[2]:" + array[2]);// 对应生活中第3个元素
        String newArray=Arrays.toString(array);
        System.out.println("数组:" + newArray);// 对应生活中第4个元素

        /**
         * 索引 在英文单词 index
         */
    }
}
