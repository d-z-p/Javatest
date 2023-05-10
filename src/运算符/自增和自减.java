package 运算符;

/*解析：

int b = ++a; 拆分运算过程为: a=a+1=4; b=a=4, 最后结果为b=4,a=4

int d = --c; 拆分运算过程为: c=c-1=2; d=c=2, 最后结果为d=2,c=2

2、前缀自增自减法(++a,--a): 先进行自增或者自减运算，再进行表达式运算。

3、后缀自增自减法(a++,a--): 先进行表达式运算，再进行自增或者自减运算*/
public class 自增和自减 {

	public static void main(String[] args) {
		// TODO 自动生成的方法存根
		   int a = 5;//定义一个变量；
	        int b = 5;
	        int x = 2*++a;
	        int y = 2*b++;
	        System.out.println("自增运算符前缀运算后a="+a+",x="+x);
	        System.out.println("自增运算符后缀运算后b="+b+",y="+y);
	    }
	}


