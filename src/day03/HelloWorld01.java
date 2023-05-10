package day03;


public class HelloWorld01{
	
	public static void main(String[] args){
	 //左边&右边 都必须为true 则返回结果是为true
	 System.out.println("&并且");	 
	 System.out.println(true&true);	
	 System.out.println(true&false);	
	 System.out.println(false&false);	
     int a=10;
     int b=20;	 
	 int c=30;
	 System.out.println("&演示比较");
	 // a>b false b>c  false
	 System.out.println(a>b&b>c);// false
     // a<b	 true  b<c true
	 System.out.println(a<b&b<c); //true
     // a<b true b>c false
	 System.out.println(a<b&b>c); //false	
	 System.out.println("|演示比较");
	 //左边|右边 只要有一个是为true的话 则返回结果是为true	 
	 System.out.println(true|false); //true	
	 System.out.println(false|false);	 // false
	 System.out.println(true|true); //true	
	 System.out.println("--------------");	 
	  // a>b false b>c  false
	 System.out.println(a>b|b>c);// false
     // a<b	 true  b<c true
	 System.out.println(a<b|b<c); //true
     // a<b true b>c false
	 System.out.println(a<b|b>c); //true	
	 System.out.println("--逻辑异或--------");	
	 System.out.println(true^false); //true	
	 System.out.println(true^true); //false 
	 System.out.println(false^false); //false 	
	 System.out.println(!false); //false 	 
	}

}
