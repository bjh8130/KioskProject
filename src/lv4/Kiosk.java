package lv4;

import java.util.List;
import java.util.Scanner;

public class Kiosk {

    // 속성
    private Scanner sc = new Scanner(System.in);
    private List<Menu> menuArrayList;

    // 생성자

    public Kiosk(List<Menu> menuArrayList) {
        this.menuArrayList = menuArrayList;
    }
    //기능
    public void start() {

        while (true) {
            // 1. 메뉴목록 띄우기
            System.out.println("[ MAIN MENU ]");

            for (Menu menuList : menuArrayList) {
                System.out.println(menuList.getCategoryNumber() + ". " + menuList.getCategoryName());
            }
            System.out.print("메뉴를 선택해주세요: ");

            //2. 사용자가 메뉴선택
            int menuChoice = sc.nextInt();
            if (menuChoice == 1) {
               Menu findmenuList = menuArrayList.get(menuChoice - 1);
               List<MenuItem> burgerMenuItemList = findmenuList.getMenuItemList();
                System.out.println(burgerMenuItemList.getName());


            }  else if (menuChoice == 0) {
                System.out.println("0. 종료       | 종료");
                break;
            } else {
                System.out.println("잘못입력하셨습니다. ");
            }

            // 3. 선택받은 번호에 대한 메뉴찾기


//            메뉴아이템 목록 띄우기
//            System.out.println("         ");
//            System.out.println("[ SHAKESHACK MENU ]");
//
//            int menuItemNumber = 1;
//            for (MenuItem burgerItem : burgerMenuItemList) {
//                System.out.println(menuItemNumber+ ". " + burgerItem.getName() + burgerItem.getPrice() + burgerItem.getInformation());
//                menuItemNumber += 1;
//
//            }
//            System.out.print("무슨 메뉴를 고르시겠습니까?: ");
//
//
//            // 2. 메뉴아이템목록에서 사용자가 원하는 메뉴 선택
//            int burgerChoice = sc.nextInt(); // 스캐너 객체 생성 -> 입력한 Int 값을 burgerChoice에 할당
//
//
//            // 3. 선택한 메뉴 출력
//            if (0 < burgerChoice && burgerChoice < 5) {
//                MenuItem findMenuItem = burgerMenuItemList.get(burgerChoice - 1);
//                String findMenuItemName = findMenuItem.getName();
//                double findMenuItemPrice = findMenuItem.getPrice();
//                String findMenuItemInformation = findMenuItem.getInformation();
//                System.out.println(findMenuItemName + findMenuItemPrice + findMenuItemInformation);
//
//            }  else if (burgerChoice == 0) {
//                System.out.println("0. 종료       | 종료");
//                break;
//            }
//            else {
//                System.out.println("잘못입력하셨습니다.");
//            }


        }
    }
}
