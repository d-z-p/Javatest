package 循环架构;

public class break1 {

	public static void main(String[] args) {
		// TODO 自动生成的方法存根
		int [] numbers = {10, 20, 30, 40, 50};
		 
	      for(int x : numbers ) {
	         // x 等于 30 时跳出循环
	         if( x == 30 ) {
	            break;
	         }
	         System.out.print( x );
	         System.out.print("\n");
	      }
	   }

	}


