package 异常处理;

/*throw 关键字用于在当前方法中抛出一个异常。

通常情况下，当代码执行到某个条件下无法继续正常执行时，可以使用 throw 关键字抛出异常，以告知调用者当前代码的执行状态。

例如，下面的代码中，在方法中判断 num 是否小于 0，如果是，则抛出一个 IllegalArgumentException 异常。*/
public class throw1 {

	private static int num=-2;

	public static void main(String[] args) {
		  if (num < 0) {
			    throw new IllegalArgumentException("Number must be positive");
			  }

	}

}
