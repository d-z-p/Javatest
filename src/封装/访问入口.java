package 封装;

public class 访问入口{
	   public static void main(String args[]){
		   创建赋取值方法 encap = new 创建赋取值方法();
	      encap.setName("James");
	      encap.setAge(20);
	      encap.setIdNum(12);
	 
	      System.out.print("Name : " + encap.getName()+
	                             " Age : "+ encap.getAge()+" 编号为 :"+ encap.getIdNum());
	    }
	}