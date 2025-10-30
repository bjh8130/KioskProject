package lv4;

import java.util.List;
// 메뉴라는 클래스로 객체를 만들어야 한다

public class Menu {
    // 속성
    private int categoryNumber;
    private String categoryName;
    private List<MenuItem> menuItemList;


    // 생성자
    public Menu(int categoryNumber, String categoryName, List<MenuItem> menuItemList) {
        this.categoryNumber = categoryNumber;
        this.categoryName = categoryName;
        this.menuItemList = menuItemList;
    }

    // 기능
    public int getCategoryNumber() {
        return  this.categoryNumber;
    }

    public String getCategoryName() {
        return this.categoryName;
    }

    public List<MenuItem> getMenuItemList() {
        return  this.menuItemList;
    }





    //속성
//    List<MenuItem> burgerMenuItemList = new ArrayList<>();
//
//    MenuItem shackBurgerMenuItem = new MenuItem("ShackBurger ", 6.9, " 토마토, 양상추, 쉑소스가 토핑된 치즈버거");
//    MenuItem smokeShackMenuItem = new MenuItem("SmokeShack ", 8.9, " 베이컨, 체리 페퍼에 쉑소스가 토핑된 치즈버거");
//    MenuItem cheeseBurgerMenuItem = new MenuItem("Cheeseburger ", 6.9, " 포테이토 번과 비프패티, 치즈가 토핑된 치즈버거");
//    MenuItem hamburgerMenuItem = new MenuItem("Hamburger ", 5.4, " 비프패티를 기반으로 야채가 들어간 기본버거");
//
//    List<MenuItem> drinkMenuItemList = new ArrayList<>();
//
//    MenuItem colaMenuItem = new MenuItem("Cola",2.0, "코카콜라");
//    MenuItem sodaMenuItem = new MenuItem("Soda",2.0, "칠성사이다");
//    MenuItem zeroColaMenuItem = new MenuItem("ZeroCola",2.0, "제로콜라");
//    MenuItem waterMenuItem = new MenuItem("Water",1.0, "삼다수");
//
//    List<MenuItem> dessertMenuList = new ArrayList<>();
//
//    MenuItem saladMenuItem = new MenuItem("Salad", 3.5, "양배추와 마요네즈, 비네그레트 드레싱을 버무려 만든 코울슬로 샐러드");
//    MenuItem chipsMenuItem = new MenuItem("Chips", 2.2, "감자칩 (케찹, 마요네즈 제공)");
//    MenuItem iceCreamMenuItem = new MenuItem("IceCream", 1.8, "소프트콘아이스크림");
//
//    //생성자
//    public Menu(MenuItem foodMenuList) {
//
//    }
//
//    //기능
//    public MenuItem burgerMenuItemMenu() {
//        burgerMenuItemList.add(shackBurgerMenuItem);
//        burgerMenuItemList.add(smokeShackMenuItem);
//        burgerMenuItemList.add(cheeseBurgerMenuItem);
//        burgerMenuItemList.add(hamburgerMenuItem);
//
//        return burgerMenuItemList;
//    }
//
//    public MenuItem drinkMenuItemMenu() {
//        drinkMenuItemList.add(colaMenuItem);
//        drinkMenuItemList.add(sodaMenuItem);
//        drinkMenuItemList.add(zeroColaMenuItem);
//        drinkMenuItemList.add(waterMenuItem);
//
//        return drinkMenuItemList;
//    }
//
//    public MenuItem dessertMenuList() {
//        dessertMenuList.add(saladMenuItem);
//        dessertMenuList.add(chipsMenuItem);
//        dessertMenuList.add(iceCreamMenuItem);
//
//        return (MenuItem) dessertMenuList;
//    }


}
