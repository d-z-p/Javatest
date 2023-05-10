
package 汇总;

/*对象和类的关系：

对象是根据类创建的。在Java中，使用关键字new来创建一个新的对象。创建对象需要以下三步：

声明：声明一个对象，包括对象名称和对象类型。

实例化：使用关键字new来创建一个对象。

初始化：使用new创建对象时，会调用构造方法初始化对象。*/
public class 对象 {

	   public 对象(String name){

	      //这个构造器仅有一个参数：name

	      System.out.println("小狗的名字是 : " + name ); 

	   }

	   public static void main(String[] args){

	      // 下面的语句将创建一个Puppy对象

		   对象 myPuppy = new 对象( "tommy" );   
		   对象 myPuppy3 = new 对象(""); 

	   }

	}