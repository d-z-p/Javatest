package 接口继承;

import 接口.接口实现类;

/*接口支持多继承，一个接口可以有多个父接口，子接口扩展某个父接口，将会获得父接口里定义的所有抽象方法、常量。

一个接口继承多个父接口时，多个父接口排在extends关键字之后*/
interface interfaceA
{

  int PROP_A = 5;

  void testA();

}

interface interfaceB

{

  int PROP_B = 6;

  void testB();

}

interface interfaceC extends interfaceA, interfaceB

{

  int PROP_C = 7;

  void testC();

}

public class 接口实现类1

{

public static void main(String[] args)

{

System.out.println(interfaceC.PROP_A);

System.out.println(interfaceC.PROP_B);

System.out.println(interfaceC.PROP_C);


}

}



