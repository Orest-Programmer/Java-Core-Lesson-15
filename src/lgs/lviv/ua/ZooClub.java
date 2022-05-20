package lgs.lviv.ua;

import java.util.*;

public class ZooClub {
        Scanner sc = new Scanner(System.in);
        List<Animal> pet = new ArrayList<>();
        List<Person> person = new ArrayList<>();
        Map<Person, List<Animal>> map = new HashMap<>();

        public void addPerson(){
                System.out.println("Введіть ім'я учасника клубу:");
                String enterName = sc.next();
                System.out.println("Введіть вік учасника клубу:");
                int enterAge = sc.nextInt();

                map.put(new Person(enterName, enterAge), new ArrayList<Animal>());
        }
        public void addPet(){
                System.out.println("Введіть імя учасника клубу до якого хочете добавити тваринку:");
                String enterPersonName = sc.next();
                System.out.println("Введіть тип тваринки:");
                String enterType = sc.next();
                System.out.println("Введіть ім'я тваринки:");
                String enterName = sc.next();
                pet.add(new Animal(enterType,enterName));

                Iterator<Map.Entry<Person, List<Animal>>> iterator = map.entrySet().iterator();

                while (iterator.hasNext()){
                        Map.Entry<Person, List<Animal>> next = iterator.next();
                        if(next.getKey().getName().equals(enterPersonName)){
                                List<Animal> value = next.getValue();
                                Animal pet = new Animal(enterType, enterName);
                                value.add(pet);
                                next.setValue(value);
                        }
                }
        }
        public void removeFromClub(){
                System.out.println("Введіть учасника клубу з якого хочете видалити тваринку");
                String enterPersonName = sc.next();
                System.out.println("Введіть ім'я тваринки:");
                String enterName = sc.next();
                Iterator<Map.Entry<Person, List<Animal>>> iterator = map.entrySet().iterator();

                while (iterator.hasNext()){
                        Map.Entry<Person, List<Animal>> next = iterator.next();
                        if(next.getKey().getName().equals(enterPersonName)){
                                List<Animal> value = next.getValue();
                                Iterator<Animal> iterator2 = value.iterator();
                                while (iterator2.hasNext()){
                                        Animal next2 = iterator2.next();
                                        if(next2.getName().equals(enterName)){
                                                iterator2.remove();
                                        }
                                }
                                System.out.println("Тваринку видалено з клубу!");
                        }
                }
        }

        public void removePerson(){
                System.out.println("Введіть учасника клубу з якого хочете видалити тваринку");
                String enterPersonName = sc.next();

                Iterator<Map.Entry<Person, List<Animal>>> iterator = map.entrySet().iterator();

                while (iterator.hasNext()){
                        Map.Entry<Person, List<Animal>> next = iterator.next();
                        if(next.getKey().getName().equals(enterPersonName)){
                                iterator.remove();
                                System.out.println("Учасника клубу видалено!");
                        }
                }
        }

        public void removeAnimalsFromAllPersons(){
                System.out.println("Введіть ім'я тваринки:");
                String enterName = sc.next();
                Iterator<Map.Entry<Person, List<Animal>>> iterator = map.entrySet().iterator();

                while (iterator.hasNext()){
                        Map.Entry<Person, List<Animal>> next = iterator.next();

                                List<Animal> value = next.getValue();
                                Iterator<Animal> iterator2 = value.iterator();
                                while (iterator2.hasNext()){
                                        Animal next2 = iterator2.next();
                                        if(next2.getName().equals(enterName)){
                                                iterator2.remove();
                                        }
                                }
                                System.out.println("Тваринок видалено з клубу!");

                }
        }

        public void displayZooClub(){
                System.out.println(map);
        }


}
