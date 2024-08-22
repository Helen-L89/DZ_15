package Menu;

import java.util.Scanner;

public class AnimalApp {

    public static void main(String[] args) {

         Scanner scanner = new Scanner(System.in);

//        System.out.println("Привет,вводи цифру");
//                int number = scanner.nextInt();
//
//        System.out.println("Привет,вводи имя");
//        String message = scanner.next(); // либо scanner.nextLine(); но две строки подряд будет
//
//        System.out.println("Привет/"+message+"цифра,которую ты ввел "+number);

        Boolean exit = false;

        while(!exit){


        System.out.println("Привет,вводи команду");
        String input = scanner.next();
        Command command = Command.fromString(input);

if(command==null){
    System.out.println("ввод пустой команды");
}

switch (command){
    case ADD:
        System.out.println("ввод add");
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
