import animals.Dog;
import animals.Puppy;

class main {

    public static void main(String[] args) {
        Dog dog = new Dog("Charly", 5);
        Dog dog2 = new Dog("Mus", 6);
        //dog.speak();
       // dog2.speak();


        //String v = dog.name;
        //Integer v2 = dog.age;

        Puppy puppy = new Puppy();

        puppy.speak();
        dog.speak();

        //вывод перегрузки overload
        /*puppy.play();
        puppy.play(5);
        puppy.play(6,4);*/


    }


}
