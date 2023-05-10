package 异常处理;

/*try
{
   // 程序代码
}catch(ExceptionName e1)
{
   //Catch 块
}*/
public class 捕获异常 {

	public static void main(String[] args) {
		 try{
	         int a[] = new int[2];
	         System.out.println("Access element three :" + a[3]);
	      }catch(ArrayIndexOutOfBoundsException e){
	         System.out.println("Exception thrown  :" + e);
	      }
	      System.out.println("Out of the block");
	   }

	}


