package 汇总;
public class 函数调用{
  private int num=0;
  public static void main(String[] args) {

	        函数调用 c1=new 函数调用(1);
	        函数调用 c2=new 函数调用();
	        c1.demoFunction(25);
	        c1.demoFunction2();
	        
	    
  }
//无参构造函数
函数调用(){
	System.out.println("调用无参构造函数");
	}



//有参构造函数

函数调用(int num){
   System.out.println("调用有参构造函数"+" "+ num);
}

//普通成员函数
void demoFunction(int num) {
	System.out.println("调用成员变量函数"+" "+"dzp"+" "+num);
	}
//普通成员函数
void demoFunction2() {
	System.out.println("调用成员变量函数"+" "+"dzp");
	}
}
