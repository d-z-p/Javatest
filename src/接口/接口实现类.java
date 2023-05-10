package 接口;

public class 接口实现类 implements 接口声明{
	 
	   public void eat(){
	      System.out.println("Mammal eats");
	   }
	 
	   public void travel(){
	      System.out.println("Mammal travels");
	   }
	 
	   public int noOfLegs(){
		 System.out.println("noOfLegs");
		 return 0;
	      
	   }
	 
	   public static void main(String args[]){
	      接口实现类 m = new 接口实现类();
	      m.eat();
	      m.travel();
	      m.noOfLegs();
	   }


	}
