package 汇总;

import java.util.Scanner;


public class test {


public static void function() throws NumberFormatException{ 
    String s = "abc"; 
    System.out.println(Double.parseDouble(s)); 
  } 
    
  public static void main(String[] args) { 
    try { 
      function(); 
    } catch (NumberFormatException e) { 
      System.err.println("非数据类型不能转换。"); 
      //e.printStackTrace(); 
    } 
} 
}
	 
