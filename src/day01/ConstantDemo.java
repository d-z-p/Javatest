package day01;

/**
常量类型	说明	举例
字符串常量	用双引号括起来的内容	举例：”每特教育” ,”余胜军” ,”HelloWorld”
整数常量	不带小数点的数字	888,666,999
小数常量	带小数的数字	26.66,13.14
字符常量	用单引号’’括起来的内容	‘男’,’女’
布尔常量	布尔值,表示真假	只有两个值:true（真）false（假）
空常量	一个特殊的值,空值	值是：null
*/
public class ConstantDemo{
	
	public static void main(String[] args){ //程序入口
//		public：此关键字指定方法的可见性。在这种情况下，main 方法被声明为 public，这意味着它可以从程序中的任何地方访问。
//		static: 这个关键字表示main方法属于类本身，而不属于类的实例。
//		void: 这是main方法的返回类型，也就是说它不返回任何值。
//		main: 这是方法的名称。它必须完全拼写为“main”，以便程序能够找到它并执行它。
//		String[] args：这是main方法的参数列表。它采用字符串数组作为输入，可用于从命令行向程序传递参数。
		// 这是我们第一条输出语句
 	    System.out.println("字符串常量：HelloWorld www.mayikt.com");
		System.out.println("----------整数常量-------------");
 	    System.out.println(666);	
 	    System.out.println(888);	
 	    System.out.println(555);	
		System.out.println("-----------小数常量------------");	
 	    System.out.println(3.125);		
		System.out.println(66.66);	
		System.out.println("----------字符常量-------------");	
 	    System.out.println('男');		
		System.out.println('女');	
		System.out.println("----------布尔常量-------------");		
		System.out.println(true);	
		System.out.println(false);
		System.out.println("----------布尔常量 null 常量不能够输出-------------");					
	}

}
