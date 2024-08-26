package animals;

public class Animal_dz {
        String name;
        Integer age;
        Integer weight;
        String color;

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

    public Integer getWeight() {
        return weight;
    }

    public void setWeight(Integer weight) {
        this.weight = weight;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void say(){
        System.out.println("Я говорю");
    };
    public void go(){
        System.out.println("Я иду");
    };
    public void drink(){
        System.out.println("Я пью");
    };
    public void eat(){
        System.out.println("Я ем");
    };


}
