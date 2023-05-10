package day2;

/**
  这是我第一个JavaHelloWorld程序
  类名称定义的格式： 数据类型 变量名称=变量值
  public class 类名{
  }
*/
public class HelloWorld12{
	
	public static void main(String[] args){
	   // 定义第一只老虎的体重180
	   int weight1 =180;
	   // 定义第二只老虎的体重200
	   int weight2 =200;	
       boolean b=weight1==weight2?true:false;   
       System.out.println(b?"两只老虎体重相等的":"两只老虎体重不相等的"); 		   
	}

}
