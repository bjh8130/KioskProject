package lv2;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        // 10. List를 선언하여 여러 MenuItem을 추가
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

        // 4. 주문과정을 반복하기 위해 while구문 사용
        // 논리형 flag 선언 후 종결조건으로 걸어둔다 -> 마지막 선택지가 0으로 "종료"일 경우 false로 반복종료
        boolean flag = true;
        while (flag) {
            System.out.println("[ SHAKESHACK MENU ]");

            // 1. 메뉴판 보여주기
            // 12. 컬렉션을 활용해서 출력해봐!!
            for (MenuItem burgerItem : burgerMenuItemList) {
                System.out.println(burgerItem.getName() + burgerItem.getPrice() + burgerItem.getInformation());
            }
            System.out.print("무슨 메뉴를 고르시겠습니까?: ");

            // 2. 사용자가 입력한 메뉴번호 받기
            // 스캐너 객체 생성 -> 입력한 Int 값을 burgerChoice에 할당
            Scanner sc = new Scanner(System.in);
            int burgerChoice = sc.nextInt();

            // 3. 메뉴번호에 맞는 메뉴 출력하기
            //13. 메뉴 출력을 burgerMenuItemList 리스트를 활용해서 출력
            // List 기능 중 하나인 get()으로 요소를
            switch (burgerChoice) {
                case 0 :
                    System.out.println("0. 종료       | 종료");
                    flag = false;
                    break;

                default:
                    // 매우 나쁜 습관 . 가져와서 하면 되는데 필요할때마다 같은 동작반복
//                    System.out.print(burgerMenuItemList.get(burgerChoice-1).getName());
//                    System.out.print(burgerMenuItemList.get(burgerChoice-1).getPrice());
//                    System.out.println(burgerMenuItemList.get(burgerChoice-1).getInformation());

                    // 논리적인 방법 : 리스트의 요소를 가져와서 findMenuItem 변수에 넣어준다.
                   MenuItem findMenuItem = burgerMenuItemList.get(burgerChoice - 1);
                   String findMenuItemName = findMenuItem.getName();
                   double findMenuItemPrice = findMenuItem.getPrice();
                   String findMenuItemInformation = findMenuItem.getInformation();
                   System.out.println(findMenuItemName + findMenuItemPrice + findMenuItemInformation);
            }
            System.out.println(" = ");


        }

    }
}
