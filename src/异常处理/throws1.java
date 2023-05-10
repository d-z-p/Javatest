package 异常处理;



import java.util.Scanner;

class MyException extends Exception {


	public MyException(String a) {
		// TODO 自动生成的构造函数存根
		super(a);
	}
   
}

public class throws1 {

    public static void main(String[] args) {
        try {
            test();
        } catch (MyException e) {
            System.out.println("Catch My Exception");
            e.printStackTrace();
        }
    }
    public static void test() throws MyException{
        try {
            int i = 10/0;
              System.out.println("i="+i); 
        } catch (ArithmeticException e) {
            throw new MyException("This is MyException");
        }
    }
}
