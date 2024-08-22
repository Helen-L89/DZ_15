package animals;

 public class Puppy2 extends Dog{

    @Override
    public void speak() {
        System.out.println("skul");
        play();
        System.out.println("skul2");
        System.out.println("skul3");
        System.out.println("skul4");


    }

//    public void play() {
//        System.out.println("lalala");
//    }

      public void play(){};

    //public  Puppy (String name, Integer age) {
       // super (name,age);

    //ниже это перегрузка overload
    public void play(Integer n) {
        System.out.println("играю минут "+ n);
    }

    public void play(Integer n, Integer v) {
        System.out.println("играю играю играю минут "+ n +v);
    }


}

