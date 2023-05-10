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
public class HelloWorld09{
	
	public static void main(String[] args){
	Scanner sc= new Scanner(System.in);
	System.out.println("请输入学生的成绩");
	int result=sc.nextInt();
	if(result>90&&result<=100){
	 System.out.println("成绩为优秀!");			
	}else if(result>=80&&result<=90){
	 System.out.println("成绩为良");		
	}else if(result>=70&&result<80){
	 System.out.println("成绩为中等");		
	}else if(result>=60&&result<70){
	 System.out.println("成绩为及格");		
	}else{
	 System.out.println("成绩为不及格");		
	}
  
	
	}

}
