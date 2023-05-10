package 汇总;



/*重写(Override)
重写是子类对父类的允许访问的方法的实现过程进行重新编写,返回值和形参都不能改变。即外壳不变，核心重写!
重写的好处在于子类可以根据需要，定义特定于自己的行为。 也就是说子类能够根据需要实现父类的方法。实例如下:*/
class Animal{
    public void move() {
		System.out.println("父类1");
    }

	public void move1() {
		// TODO 自动生成的方法存根
		System.out.println("父类2");
	}
		
}
class Dog extends Animal{
	public void move() {
		System.out.println("子类1");
	}
	public void move1() {
		System.out.println("子类2");
	}
		
}
	public class 重写{
		public static void main(String[] args) {
			Animal a=new Animal();
			Animal b=new Dog();
			a.move();
			b.move();
		}
	}
