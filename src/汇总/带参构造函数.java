package 汇总;

public class 带参构造函数 {
	 public static void main(String[] args) {
	        //输出Hello World。new对象一建立，就会调用对应的构造函数Confun()，并执行其中的println语句。

	        Confun1 c1=new Confun1(1);

	       
	    }
	}
	class Confun1{        
	    Confun1(int num){        
	        //定义构造函数，输出Hello World
	        System.out.println(num);
	    }
    

	}
	    

