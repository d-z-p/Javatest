package 汇总;

/*重载（Overload）：指一个类中可以有多个方法具有相同的名字，但这些方法的参数不同（参数的类型和个数不同）。*/
public class 重载 {
	/*
	 * public int test() { System.out.println("test1"); return 1; }
	 */
	public int test() {
		int test=1;
		System.out.println("test1");
		return test;
	}

	public void test(int a) {
		System.out.println("test2");
	}

	// 以下两个参数类型顺序不同
	public String test(int a, String s) {
		System.out.println("test3");
		return "returntest3";
	}

	public String test(String s, int a) {
		System.out.println("test4");
		return "returntest4";
	}

	public static void main(String[] args) {
		重载 o = new 重载();
		System.out.println(o.test());
		o.test(1);
		System.out.println(o.test(1,"test3"));
		System.out.println(o.test("test4",1));

	}
}
