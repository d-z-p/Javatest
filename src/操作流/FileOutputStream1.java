package 操作流;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;

public class FileOutputStream1 {

	public static void main(String[] args) throws FileNotFoundException {
		// TODO 自动生成的方法存根
		PrintWriter pw = new PrintWriter("d:/test.txt");
		pw.println("dzp");
		pw.close();

	}
}
