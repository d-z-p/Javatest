package 异常处理;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

/*try{
	   // 程序代码
	}catch(异常类型1 异常的变量名1){
	  // 程序代码
	}catch(异常类型2 异常的变量名2){
	  // 程序代码
	}catch(异常类型2 异常的变量名2){
	  // 程序代码
	}
上面的代码段包含了 3 个 catch块。

可以在 try 语句后面添加任意数量的 catch 块。

如果保护代码中发生异常，异常被抛给第一个 catch 块。

如果抛出异常的数据类型与 ExceptionType1 匹配，它在这里就会被捕获。

如果不匹配，它会被传递给第二个 catch 块。

如此，直到异常被捕获或者通过所有的 catch 块*/
public class 多重捕获块 {
	private static FileInputStream file;
	private static String fileName;
	private static byte x;

	public static void main(String[] args) {
		try {
		    file = new FileInputStream(fileName);
		    x = (byte) file.read();
		} catch(FileNotFoundException f) { // Not valid!
		    f.printStackTrace();
		    return ;
		} catch(IOException i) {
		    i.printStackTrace();
		    return ;
		}
	}


}
