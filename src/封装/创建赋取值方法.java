package 封装;

/*修改属性的可见性来限制对属性的访问（一般限制为private），
将 name 和 age 属性设置为私有的，只能本类才能访问，其他类都访问不了，如此就对信息进行了隐藏。
例如*/
public class 创建赋取值方法{
    private String name;
    private int age;
    private int idNum;

    public int getAge(){
      return age;
    }

    public String getName(){
      return name;
    }
    public int getIdNum(){
        return idNum;
      }


    public void setName(String name){
      this.name = name;
    }
    public void setAge(int age){
        this.age = age;
      }
    public void setIdNum(int idNum){
        this.idNum = idNum;
      }



}
