package Model.Controller;

import Model.Classes.*;
import Model.View.View;

import java.util.Scanner;

public class Controller {
    public Controller(){
        Scanner scanner = new Scanner(System.in);
        WareHouse wareHouse = new WareHouse(100);
        Product iphone = new Product("Iphone_14", 10, 120000.0);
        Product samsung = new Product("Samsung_S23", 23, 115000.0);
        Product huawei = new Product("Huawei", 5, 56000.0);
        wareHouse.addProduct(iphone);
        wareHouse.addProduct(samsung);
        wareHouse.addProduct(huawei);
        View view = new View();
        Searcher searcher = new Searcher();
        Order order = new Order();
        HomeDelivery homeDelivery = new HomeDelivery();
        SelfDelivery selfDelivery = new SelfDelivery();
        int counter = 0;
        while (counter != 7){
            System.out.println("\nМеню: ");
            System.out.println("\n(1) Посмотреть товар на складе.");
            System.out.println("(2) Добавить товар.");
            System.out.println("(3) Поиск товара по параметру.");
            System.out.println("(4) Отгрузить товар.");
            System.out.println("(5) Посмотреть свободное место на складе.");
            System.out.println("(6) Удаление товара.");
            System.out.println("(7) Закрыть программу.");
            System.out.print("\nВведите желаемую команду: ");
            counter = scanner.nextInt();
            switch (counter){
                case 1 -> view.getWareHouseInfo(wareHouse);
                case 2 -> {
                    System.out.print("\nВведите имя товара: ");
                    String name = scanner.next();
                    System.out.print("Введите количество товара: ");
                    int amount = scanner.nextInt();
                    System.out.print("Введите цену товара: ");
                    double price = scanner.nextDouble(); // проверить формат
                    wareHouse.addProduct(new Product(name, amount, price));
                }
                case 3 -> {
                    System.out.println("\n(1) Поиск товара по имени.");
                    System.out.println("(2) Поиск товара по цене.");
                    System.out.println("(3) Поиск товара по количеству.");
                    System.out.print("\nВведите желаемую команду: ");
                    int input = scanner.nextInt();
                    if (input == 1) {
                        System.out.print("Введите имя товара: ");
                        String name = scanner.next();
                        System.out.println();
                        searcher.findProductByName(wareHouse, name, view);
                    }
                    if (input == 2){
                        System.out.print("\nВведите минимальную цену товара (от): ");
                        double priceMin = scanner.nextDouble();
                        System.out.print("Введите минимальную цену товара (от): ");
                        double priceMax = scanner.nextDouble();
                        System.out.println();
                        searcher.findProductByPrice(wareHouse, priceMin, priceMax, view);
                    }
                    if (input == 3){
                        System.out.print("\nВведите необходимое количество товара: ");
                        int amount = scanner.nextInt();
                        System.out.println();
                        searcher.findProductByAmount(wareHouse, amount, view);
                    }
                }
                case 4 -> {
                    System.out.println("\n(1) Отгрузить товар на склад.");
                    System.out.println("(2) Отправить товар по адресу.");
                    System.out.print("\nВведите желаемую команду: ");
                    int input = scanner.nextInt();
                    if (input == 1){
                        System.out.print("\nВведите id товара: ");
                        int id = scanner.nextInt();
                        System.out.print("Введите необходимое количество товара: ");
                        int amount = scanner.nextInt();
                        order.getSelfOrder(id, amount, wareHouse, selfDelivery, view);
                    }
                    if (input == 2){
                        System.out.print("\nВведите id товара: ");
                        int id = scanner.nextInt();
                        System.out.print("Введите необходимое количество товара: ");
                        int amount = scanner.nextInt();
                        System.out.print("Введите адрес: ");
                        String address = scanner.next();
                        order.getHomeOrder(id, amount, wareHouse, homeDelivery, address, view);
                    }
                }
                case 5 -> System.out.println("\nМеста на складе - " + wareHouse.getWareHouseAmount());
                case 6 -> {
                    System.out.print("\nВведите id товара который хотите удалить: ");
                    Integer id = scanner.nextInt();
                    wareHouse.deleteProduct(id);
                }
            }
        }
        scanner.close();
    }
}
