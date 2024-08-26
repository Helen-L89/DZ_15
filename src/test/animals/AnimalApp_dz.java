package animals;


import menu.Command_dz;

import java.util.Scanner;

public class AnimalApp_dz {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        Boolean exit = false;

        while(!exit){


            System.out.println("Привет,вводи команду");
            String input = scanner.next();
            Command_dz command = Command_dz.fromString(input);

            if(command==null){
                System.out.println("ввод пустой команды");
            }

            switch (command){
                case ADD:
                    System.out.println("какое это животное?");
                    System.out.println("как зовут?");
                    System.out.println("возраст?");
                    System.out.println("вес?");
                    System.out.println("цвет?");
                    break;
                case LIST:
                    System.out.println("ввод List");
                    break;
                case EXIT:
                    exit=true;
                    System.out.println("выход");
                    break;
                default:
                    System.out.println("ввод неверный");

            }
        }
        scanner.close();

    }
}


