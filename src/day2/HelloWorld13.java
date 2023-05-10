package day2;

/**
  这是我第一个JavaHelloWorld程序
  类名称定义的格式： 数据类型 变量名称=变量值
  public class 类名{
  }
*/
public class HelloWorld13{
	
	public static void main(String[] args){
        //定义这三名同学的升高 jvm  i++ ++i 必须站在字节码角度 2年
		
		int height1 =150;
		int height2 =210;	
		int height3 =165;
		// 150>210 tempMaxheight=210
		int tempheight=  height1>height2?height1:height2;
		int maxHeight =tempheight>height3?tempheight:height3;
       System.out.println(maxHeight); 		
	}
}
