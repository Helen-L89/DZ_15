package animals;

public class Duck_dz extends Animal_dz implements Flying_dz {


        @Override
        public void say() {
            System.out.println("Кря");
        }

    @Override
    public void Fly() {
        System.out.println("Я лечу");
    }


}
