import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Runner {
    public static void main(String[] args) {
        CarShop carShop1 = new CarShop("BMW_SHOP", "KIROVA", "BMW");
        CarShop carShop2 = new CarShop("AUDI_SHOP", "SOV", "AUDI");
        CarShop carShop3 = new CarShop("RENO_SHOP", "KOSTYKOVKA", "RENO");

        FoodShop foodShop1 = new FoodShop("EVRO", "LENINA", "All_FOOD");
        FoodShop foodShop2 = new FoodShop("MILCAVITA", "Lenina1", "MILK_FOOD");
        FoodShop foodShop = new FoodShop("FISH", "LENINA3", "FISH_FOOD");

        ClothesShop clothesShop1 = new ClothesShop("COLINS", "ADR1", "COLINS");
        ClothesShop clothesShop2 = new ClothesShop("TVOR", "ADR2", "TVOE");
        ClothesShop clothesShop3 = new ClothesShop("CL_SHOP", "ADR3", "MARK");

        List<Shop> shopList = new ArrayList<Shop>();
        shopList.add(carShop1);
        shopList.add(clothesShop2);
        shopList.add(carShop2);
        shopList.add(foodShop1);
        shopList.add(foodShop2);
        shopList.add(carShop3);
        shopList.add(foodShop);
        shopList.add(clothesShop1);
        shopList.add(clothesShop3);

        for (Shop shop : shopList) {
            System.out.println(shop);
        }
        System.out.println("================================");
        for (Shop shop : shopList) {
            if (shop instanceof ClothesShop) {
                System.out.println(shop);
            }
        }
        for (Shop shop : shopList) {
            if (shop instanceof FoodShop) {
                System.out.println(shop);
            }
        }
        for (Shop shop : shopList) {
            if (shop instanceof CarShop) {
                System.out.println(shop);
            }
        }
//        System.out.println("Enter mark: ");
//        Scanner scanner = new Scanner(System.in);
//        String mark = scanner.nextLine();
//        System.out.println(mark);
//
//        System.out.println("================================");
//        for (Shop shop : shopList) {
//            if (shop instanceof ClothesShop) {
//                ClothesShop clothesShop = (ClothesShop) shop;//приведение объекта к потомку чтобы получить поле marca
//                if (clothesShop.getMarca().equals(mark)) {
//                    System.out.println(clothesShop);
//                }
//            }
//        }

        //ввести тип FoodShop и удалить из списка объект с таким типом
        System.out.println("===============");
        System.out.println("Enter: Evro");
        Scanner scanner1 = new Scanner(System.in);
        String evro = scanner1.nextLine();
        System.out.println(evro);
        for (Shop shop : shopList) {
            if (shop instanceof FoodShop) {
                FoodShop foodShop3 = (FoodShop) shop;
                if (foodShop.getType().equals(evro)) {
                    System.out.println(foodShop3);
                }

            }
        }
    }
}
