package 汇总;

/*子类调用父类的方法*/

class Animal3{
    public void move() {
		System.out.println("父类1");
    }


		
}
class Dog11 extends Animal3{
	public void move() {
		super.move();
		System.out.println("子类1");
	}

}
	public class Super{
		public static void main(String[] args) {

			Animal3 b=new Dog11();
			b.move();
		} 
	}


