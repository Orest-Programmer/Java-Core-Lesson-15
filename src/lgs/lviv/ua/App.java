package lgs.lviv.ua;

import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ZooClub zc = new ZooClub();
        while (true){
            menu();
            switch (sc.nextInt()){
                case 1:{
                    zc.addPerson();
                    break;
                }
                case 2:{
                    zc.addPet();
                    break;
                }case 3:{
                    zc.removeFromClub();
                    break;
                }
                case 4:{
                    zc.removePerson();
                    break;
                }
                case 5:{
                    zc.removeAnimalsFromAllPersons();
                    break;
                }
                case 6:{
                    zc.displayZooClub();
                    break;
                }
                case 7:{
                    System.exit(1);
                    break;
                }

                default:{
                    System.out.println("Ви ввели не коректне число!");
                }
            }
        }
    }

    public static void menu(){
        System.out.println("Введіть 1, щоб додати учасника клубу:");
        System.out.println("Введіть 2, щоб додати тваринку до учасника клубу:");
        System.out.println("Введіть 3, щоб видалити тваринку з учасника клубу:");
        System.out.println("Введіть 4, щоб видалити учасника клубу:");
        System.out.println("Введіть 5, щоб видалити конкретну тваринку зі всіх власників:");
        System.out.println("Введіть 6, щоб вивести на екран зооклуб");
        System.out.println("Введіть 7, щоб вийти з програми:");
    }
}
