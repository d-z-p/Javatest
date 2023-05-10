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
public class HelloWorld08{
	
	public static void main(String[] args){
	Scanner sc= new Scanner(System.in);
	System.out.println("请输入一个星期数的值");
	int number=sc.nextInt();
    if(number==1){
	 System.out.println("星期一");		
	}else if(number==2){
	 System.out.println("星期二");		
	}	
	else if(number==3){
	 System.out.println("星期三");		
	}	
	else if(number==4){
	 System.out.println("星期四");		
	}	
	else if(number==5){
	 System.out.println("星期五");		
	}	
	else if(number==6){
	 System.out.println("星期六");		
	}else if(number==7){
	 System.out.println("星期日");		
	}else{
	System.out.println("您输入的星期数不正确!");			
	}
	
	}

}
