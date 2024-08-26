package animals;

public class Child_dz extends animals.Animal_dz {

       @Override
        public void say() {
                System.out.println("skl_00");
         System.out.println("Привет! меня зовут " +name +", мне " +getAge() +"лет, я вешу - " + getWeight() +"кг, мой цвет - " +color);
//           switch (true) // true - для проверки условий
//           {
//               case age =1:
//                   System.out.println("Привет! меня зовут " + name +", мне " +age +"год, я вешу - " + weight +"кг, мой цвет - " +color);
//                   break;
//               case age >= 1 && age < 5:
//                   System.out.println("Привет! меня зовут " + name +", мне " +age +"года, я вешу - " + weight +"кг, мой цвет - " +color);
//                   break;
//               case age >=5:
//                   System.out.println("Привет! меня зовут " + name +", мне " +age +"лет, я вешу - " + weight +"кг, мой цвет - " +color);
//                   break;
//               default:
//                   System.out.println("не тот возраст:)"); // Действия для остальных возрастов
//                   break;
//           }

           //или

//           if (true == age = 1) {
//               System.out.println("Привет! меня зовут " + name + ", мне " + age + "год, я вешу - " + weight + "кг, мой цвет - " + color);
//           } else if (true == age >= 1 && age < 5) {
//               System.out.println("Привет! меня зовут " + name + ", мне " + age + "года, я вешу - " + weight + "кг, мой цвет - " + color);
//           } else if (true == age >= 5) {
//               System.out.println("Привет! меня зовут " + name + ", мне " + age + "лет, я вешу - " + weight + "кг, мой цвет - " + color);
//           }





           }
    public void play(){
        System.out.println("Привет!");
    }

    public Child_dz() {
    }


}




