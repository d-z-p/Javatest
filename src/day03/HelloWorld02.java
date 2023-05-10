package day03;


public class HelloWorld02{
	
	public static void main(String[] args){
	 //左边&右边 都必须为true 则返回结果是为true
	 int a=10;
	 int b=20; 
	 //a++>100 返回为false  (b++>10)true
	 //左边返回false 右边不会执行 
	// System.out.println((a++>100)&&(b++>10));	
	//  System.out.println(a);	
	 // System.out.println(b);	 
	 System.out.println("短路或");
	 // 或者--左边和右边只要有一个返回为true 最终结果是true
	 //(a++>1) true b++>100 false
	 System.out.println((a++>1)||(b++>100));		 
	 System.out.println(a);	 
	 System.out.println(b);	 	 
	}

}
