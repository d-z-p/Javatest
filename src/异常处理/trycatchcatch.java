package 异常处理;

public class trycatchcatch {

	public static void main(String[] args) {
		// TODO 自动生成的方法存根


try{
            int i = 1/0;//发生异常立即跳往catch语句中执行，不执行异常代码下面的代码
            System.out.println("输出结果为：" + i);
        }catch (NullPointerException | ArithmeticException e) {
      e.printStackTrace();
 
      if (e instanceof NullPointerException)
        System.out.println("空指针异常");
      if (e instanceof ArithmeticException)
        System.out.println("运算条件异常");
    }

	}

}
