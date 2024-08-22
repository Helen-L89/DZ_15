package animals;

public class Dog2 extends Doggy2{
   private String name;
   private Integer age;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public void speak(){
        System.out.println("woof");

//    public Dog2(String name, Integer age) {
//        this.name = name;
//        this.age = age;
//    }
//
//    public void speak(){
//        System.out.println("woof");
//};
//
//   /* public Dog (String name,Integer age) {
//        this.name = name;
//        this.age = age;
//    }*/
//
//    public Dog2(){

    }

    //появляется метод из абстрактюкл за счет обязательного наследования
    @Override
    void breathe() {
        System.out.println("дышу");
    }
}
