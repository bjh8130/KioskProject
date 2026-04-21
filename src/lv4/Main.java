package lv4;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        // 버거메뉴아이템리스트 설정
        List<MenuItem> burgerMenuItemList = new ArrayList<>();
        MenuItem shackBurgerMenuItem = new MenuItem("ShackBurger ", 6.9," 토마토, 양상추, 쉑소스가 토핑된 치즈버거");
        MenuItem smokeShackMenuItem = new MenuItem("SmokeShack ", 8.9, " 베이컨, 체리 페퍼에 쉑소스가 토핑된 치즈버거");
        MenuItem cheeseBurgerMenuItem = new MenuItem("Cheeseburger ", 6.9, " 포테이토 번과 비프패티, 치즈가 토핑된 치즈버거");
        MenuItem hamburgerMenuItem = new MenuItem("Hamburger ", 5.4, " 비프패티를 기반으로 야채가 들어간 기본버거");
        burgerMenuItemList.add(shackBurgerMenuItem);
        burgerMenuItemList.add(smokeShackMenuItem);
        burgerMenuItemList.add(cheeseBurgerMenuItem);
        burgerMenuItemList.add(hamburgerMenuItem);

        // 음료수메뉴아이템리스트를 설정
        List<MenuItem> drinkMenuItemList = new ArrayList<>();
        MenuItem colaMenuItem = new MenuItem("Cola", 2.0, "코카콜라");
        MenuItem sodaMenuItem = new MenuItem("Soda", 2.0, "칠성사이다");
        MenuItem zeroColaMenuItem = new MenuItem("ZeroCola", 2.0, "제로콜라");
        MenuItem waterMenuItem = new MenuItem("Water", 1.0, "삼다수");
        drinkMenuItemList.add(colaMenuItem);
        drinkMenuItemList.add(sodaMenuItem);
        drinkMenuItemList.add(zeroColaMenuItem);
        drinkMenuItemList.add(waterMenuItem);

        // 디저트메뉴리스트를 설정
        List<MenuItem> dessertMenuItemList = new ArrayList<>();
        MenuItem saladMenuItem = new MenuItem("Salad", 3.5, "양배추와 마요네즈, 비네그레트 드레싱을 버무려 만든 코울슬로 샐러드");
        MenuItem chipsMenuItem = new MenuItem("Chips", 2.2, "감자칩 (케찹, 마요네즈 제공)");
        MenuItem iceCreamMenuItem = new MenuItem("IceCream", 1.8, "소프트콘아이스크림");
        dessertMenuItemList.add(saladMenuItem);
        dessertMenuItemList.add(chipsMenuItem);
        dessertMenuItemList.add(iceCreamMenuItem);

        // 메뉴리스트를 설정
        List<Menu> menuArrayList = new ArrayList<>();
        Menu burgerMenu = new Menu(1,"burger", burgerMenuItemList);
        Menu drinkMenu = new Menu(2, "drink", drinkMenuItemList);
        Menu dessertMenu = new Menu(3, "dessert", dessertMenuItemList);
        menuArrayList.add(burgerMenu);
        menuArrayList.add(drinkMenu);
        menuArrayList.add(dessertMenu);

       // Kiosk kiosk = new Kiosk(menuArrayList);
        // 의존성 주입
        // 키오스크를 메인에 소환하고 리스트를 할당한 후 변수에 할당한다
        Kiosk kiosk = new Kiosk(menuArrayList);
        kiosk.start();
    }
}
