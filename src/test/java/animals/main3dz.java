package animals;

class main3dz {

    public static void main(String[] args) {

        Animal_dz wofy = new Animal_dz();
        wofy.setName("Tommy");
        wofy.setAge(1);
        wofy.setWeight(10);
        wofy.setColor("red");

        System.out.println(wofy.getName());
        System.out.println(wofy.getAge());
        System.out.println(wofy.getWeight());
        System.out.println(wofy.getColor());

        wofy.say();
        wofy.go();
        wofy.drink();
        wofy.eat();

       Child_dz child = new Child_dz();
        child.setName("Бобик");
        child.setAge(12);
        child.setWeight(15);
        child.setColor("черный");

        System.out.println(child.getName());
        System.out.println(child.getAge());
        System.out.println(child.getWeight());
        System.out.println(child.getColor());



       child.say();
       // child.go();
       // child.drink();
       // child.eat();

        Cat_dz cat = new Cat_dz();
        cat.say();


        Dog_dz dog = new Dog_dz();
        dog.say();

        Duck_dz duck = new Duck_dz();
        duck.say();
        duck.Fly();
    }


}
