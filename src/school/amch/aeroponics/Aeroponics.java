package school.amch.aeroponics;

import java.util.Scanner;

public class Aeroponics {

    public static void printMenu(){
        System.out.println('\n');
        System.out.println("0. Quit");
        System.out.println("1. Show info");
        System.out.println("2. Start farm");
        System.out.println("3. Stop farm");
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Menu menu = new Menu();
        Farm farm = new Farm(menu);
        farm.farmSetup(3,3);

        printMenu();
        while(true)
        {
            int option = scanner.nextInt();
            menu.setState(option);
        }

    }
}
