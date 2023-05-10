package 汇总;

public class 无参构造函数 {
	 public static void main(String[] args) {
	        //输出Hello World。new对象一建立，就会调用对应的构造函数Confun()，并执行其中的println语句。
	        Confun c1=new Confun();            
	       
	    }
	}
	class Confun{        
	    Confun(){        
	        //定义构造函数，输出Hello World
	        System.out.println("Hellow World");
	    }

}