package lv3;

import java.util.List;
import java.util.Scanner;

public class Kiosk {

    // 나라는 객체를 만들때 심장이 내 안에서 만들어짐. 심장과 나는 의존성이 강하다

    //속성

    private Scanner sc = new Scanner(System.in);

    // 10. List를 선언하여 여러 MenuItem을 추가
    // 14. Kiosk 클래스 생성, 리스트를 담을 속성 생성
    private List<MenuItem> burgerMenuItemList;

    //생성자
    // 15. Main에서 키오스크에 필요한 메뉴아이템을 주입받을 생성자 생성
    public Kiosk(List<MenuItem> burgerMenuItemList) {
        this.burgerMenuItemList = burgerMenuItemList;
    }

    //기능
    public void start() {

        // 4. 주문과정을 반복하기 위해 while구문 사용
        // 논리형 flag 선언 후 종결조건으로 걸어둔다 -> 마지막 선택지가 0으로 "종료"일 경우 false로 반복종료
        while (true) {
            System.out.println("         ");
            System.out.println("[ SHAKESHACK MENU ]");

            // 1. 메뉴판 보여주기
            // 12. 컬렉션을 활용해서 출력해봐!!
            int menuItemNumber = 1;
            for (MenuItem burgerItem : burgerMenuItemList) {
                System.out.println(menuItemNumber+ ". " + burgerItem.getName() + burgerItem.getPrice() + burgerItem.getInformation());
                menuItemNumber += 1;

            }
            System.out.print("무슨 메뉴를 고르시겠습니까?: ");

            // 2. 사용자가 입력한 메뉴번호 받기
            int burgerChoice = sc.nextInt(); // 스캐너 객체 생성 -> 입력한 Int 값을 burgerChoice에 할당

            // 3. 메뉴번호에 맞는 메뉴 출력하기
            //13. 메뉴 출력을 burgerMenuItemList 리스트를 활용해서 출력
            // List 기능 중 하나인 get()으로 요소를 가져온다

            //if문
            // 16. 사용자가 입력한 burgerChoice 마다 메뉴출력
            // break가 switch 안에있으면 switch의 끝을 나타낸다. 루프안에서 break를 쓰면 루프를 탈출한다.
            // 하지만 if와 break는 관련이 없다. 이때 break는 whlie 반복을 멈추는 장치
            if (0 < burgerChoice && burgerChoice < 5) {
                MenuItem findMenuItem = burgerMenuItemList.get(burgerChoice - 1);
                String findMenuItemName = findMenuItem.getName();
                double findMenuItemPrice = findMenuItem.getPrice();
                String findMenuItemInformation = findMenuItem.getInformation();
                System.out.println(findMenuItemName + findMenuItemPrice + findMenuItemInformation);

            }  else if (burgerChoice == 0) {
                 System.out.println("0. 종료       | 종료");
                break;
            }
            else {
                System.out.println("잘못입력하셨습니다.");
            }

//            switch (burgerChoice) {
//                case 0:
//                    System.out.println("0. 종료       | 종료");
//                    flag = false;
//                    break;
//
//                default:
//                    매우 나쁜 습관 . 가져와서 하면 되는데 필요할때마다 썬칩을 사러 매번 편의점에 가야하는 행위반복 → 같은 동작반복
//                    System.out.print(burgerMenuItemList.get(burgerChoice-1).getName());
//                    System.out.print(burgerMenuItemList.get(burgerChoice-1).getPrice());
//                    System.out.println(burgerMenuItemList.get(burgerChoice-1).getInformation());

//                    논리적인 방법 : 리스트의 요소를 가져와서 findMenuItem 변수에 넣어준다.
//                    MenuItem findMenuItem = burgerMenuItemList.get(burgerChoice - 1);
//                    String findMenuItemName = findMenuItem.getName();
//                    double findMenuItemPrice = findMenuItem.getPrice();
//                    String findMenuItemInformation = findMenuItem.getInformation();
//                    System.out.println(findMenuItemName + findMenuItemPrice + findMenuItemInformation);

        }
    }
}
