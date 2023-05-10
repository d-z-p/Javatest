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
public class HelloWorld04{
	
	public static void main(String[] args){
	// 创建了一个打印机
    Scanner sc= new Scanner(System.in);
	System.out.println("请输入第一个数值类型的值");
	// 接受用户在控制台中输入int类型
    int a=sc.nextInt();	
	System.out.println("请输入第二个数值类型的值");
	int b=sc.nextInt();	
	int c=a+b;
	System.out.println("您输入a+b的值=c:"+c);	
	}

}
