package com.fomina.top.proba1;

import com.fomina.top.proba1.entity.Flat;
import com.fomina.top.proba1.service.FlatService;


import java.util.List;
import java.util.Scanner;

public class Menu {
    private Scanner scanner = new Scanner(System.in);
    private Scanner scanner2 = new Scanner(System.in);

    public void start(FlatService flatService)
    {
        boolean exit = false;
        String action;
//считать числа
        //input();
        while (!exit) {
            showMenu();
            List<Flat> flats;

            action = scanner.nextLine();
            switch (action)
            {
                case "1":

                    System.out.println(flatService.findAll());
                    break;
                case "2":
                    System.out.print("Distance to metro, м(целое число): ");
                    int distance = scanner2.nextInt();
                    flatService.findByMetro(distance);
                    break;
                case "3":
                    System.out.print("Number of rooms: ");
                    int room = scanner2.nextInt();
                    System.out.println(flatService.findFlatByRoomNum(room));
                    break;
                case "4":
                    System.out.println(flatService.count());
                     break;
                case "5":
                    System.out.print("Find all houses built no older than: ");
                    int year = scanner2.nextInt();
                    System.out.println(flatService.findFlatByYear(year));
                    break;
                case "6":
                    System.out.print("Адрес жилого дома в г.Новосибирске(формат: Советская, 62 и т.п.):  ");
                    String address = scanner2.nextLine();
                    System.out.println(flatService.findFlatByAddress(address));
                    break;
                case "7":
                    System.out.print("Find all houses not lower than (floor): ");
                    int floor = scanner2.nextInt();
                    System.out.println(flatService.findFlatByFloor(floor));
                    break;
                case "8":

                    System.out.println(flatService.findTallestByFlat());
                    break;



                case "9": exit = true; break;
                default:
                    System.out.println("Error"); break;
            }

        }
        scanner.close();
        scanner2.close();

    }

    private void showMenu()
    {
        System.out.println("1. Показать все квартиры;\n" +
                "2. Все квартиры рядом с метро;\n" +
                "3. Фильтр по количеству комнат в квартире;\n" +
                "4. Количество квартир в базе;\n" +
                "5. Фильт по году постройки дома;\n" +
                "6. Поиск квартир по адресу дома, вернет квартиры в самом дом(если есть) +  все квартиры в радиусе 200м;\n"+
                "7. Фильт по этажности дома;\n" +
                "8. Квартира из самого высокого дома ;\n" +


                "9. Exit.\n" );
    }
}
