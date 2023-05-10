package 汇总;

/*我们在类中定义了两个构造方法，一个带参数一个不带参数

我们在不带参数的构造方法中使用 this() 来访问另一个带参数的构造方法

我们在第一行的this()中输入参数来调用另一个构造方法
第一个构造方法调用了第二个构造方法后再运行自己的代码

我们在使用this()时需要注意的是

1.所有的this()都要放在构造方法的第一行运行

2.不要形成闭环*/
public class this访问构造方法 {
    static class Man{
        public int age;
        public String name;
 
        public Man(){
            this("Tom",18);
 
            System.out.println("这是不带参数的Man");
        }
        
        public Man(String name, int age){
            this.name = name;
            this.age = age;
            System.out.println("这是带参数的Man");
        }
 
    }
    
    public static void main(String[] args) {
        Man man = new Man();
    }

}