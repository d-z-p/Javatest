package 汇总;
/*1.位置：
（1）局部变量：定义在方法的内部，或者作为方法的参数
（2）全局变量：定义在方法的外部，类的内部
2.作用域：
（1）局部变量：在方法的内部使用
(2）全局变量：在类的内部都访问*/
public class 局部变量 {
    public void pupAge() {

		      int age = 0;

		      age = age + 7;

		      System.out.println("Puppy age is : " + age);

		   }



		   public static void main(String args[]) {

			   局部变量 test = new 局部变量();

		      test.pupAge();

		   }

}
