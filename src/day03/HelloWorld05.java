package day03;

/*
①导包 import java.util.Scanner;
导包的动作必须出现在定义的类上面
②创建对象
Scanner sc=new Scanner(System.in);
src是为变量的名称 可以发生变化 其他的都不允许发生变化
③接受数据
int i=sc.nextInt();// 接受一个int数据
i是为变量的名称 可以发生变化 其他的都不允许发生变	
*/
import java.util.Scanner;
public class HelloWorld05{
	
	public static void main(String[] args){
	Scanner text2= new Scanner(System.in);
	int a=text2.nextInt();
	System.out.println("你输入的第一个数是"+a);
	int b=text2.nextInt();
	System.out.println("你输入的第二个数是"+b);
	  if(a>b){
	   System.out.println("a大于b");
	  }
	  if(a<b){
	   System.out.println("a小于b");
	  }
	  if(a==b){
	   System.out.println("a等于b");
	  }
	  if(a!=b){
	   System.out.println("a不等于b");
	  }
	}

}
