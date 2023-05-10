package 汇总;
import java.io.*;
public class 变量 {
	int x1; // 实例变量，声明时可以不用赋值，有默认值
	int x2 = 10; // 实例变量
	static int y1 = 20; // 静态变量，声明时可以不用赋值，有默认值
	static int y2 = 20; // 静态变量
	 public static void main(String args[]){ // 局部变量 a 和 b
		int num = 100; // 局部变量，声明时必须赋值
		System.out.print(num);
	} 
	
}
