package lv3;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        // 10. List를 선언하여 여러 MenuItem을 추가      //
        List<MenuItem> burgerMenuItemList = new ArrayList<>();

        // 7. MenuItem 객체 생성
        // 9. MenuItem 객체 생성을 통해 이름, 가격, 설명을 세팅 초기데이터 세팅
        MenuItem shackBurgerMenuItem = new MenuItem("ShackBurger ", 6.9," 토마토, 양상추, 쉑소스가 토핑된 치즈버거");
        MenuItem smokeShackMenuItem = new MenuItem("SmokeShack ", 8.9, " 베이컨, 체리 페퍼에 쉑소스가 토핑된 치즈버거");
        MenuItem cheeseBurgerMenuItem = new MenuItem("Cheeseburger ", 6.9, " 포테이토 번과 비프패티, 치즈가 토핑된 치즈버거");
        MenuItem hamburgerMenuItem = new MenuItem("Hamburger ", 5.4, " 비프패티를 기반으로 야채가 들어간 기본버거");

        // 11. List에 각각의 버거메뉴 객체들을 추가
        burgerMenuItemList.add(shackBurgerMenuItem);
        burgerMenuItemList.add(smokeShackMenuItem);
        burgerMenuItemList.add(cheeseBurgerMenuItem);
        burgerMenuItemList.add(hamburgerMenuItem);

        // 의존성 주입
        // 16. 키오스크를 메인에 소환하고 리스트를 할당한 후 변수에 할당한다
        Kiosk kiosk = new Kiosk(burgerMenuItemList);
        kiosk.start();
    }
}
