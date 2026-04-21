package lv4;

import javax.lang.model.SourceVersion;
import java.util.List;
import java.util.Scanner;

public class Kiosk {

    // 속성
    private Scanner sc = new Scanner(System.in);
    private List<Menu> menuArrayList;
    private Menu selectedMenu;

    // 생성자

    public Kiosk(List<Menu> menuArrayList) {
        this.menuArrayList = menuArrayList;
    }
    //기능
    public void start() {
        // 1. 메뉴카테고리 보여주기
        while (true) {
            System.out.println(" [ MENU LIST ] ");
            for (Menu menu : menuArrayList) {
                System.out.println(menu.getCategoryNumber() + ". " + menu.getCategoryName());
            }
            System.out.println("0. 종료");
            System.out.print("메뉴를 골라주세요: ");
            // 2. 메뉴카테고리 중에서 사용자가 고를 메뉴카테고리번호 받기
            int menuChoice = sc.nextInt();

            // 3. 메뉴카테고리번호에 해당하는 메뉴를 가져오기 & 출력하기
            if (0 < menuChoice && menuChoice <= menuArrayList.size()) {
                this.selectedMenu = menuArrayList.get(menuChoice - 1);
                String categoryName = selectedMenu.getCategoryName();
                System.out.println(categoryName + "을 선택하셨습니다.");

            } else if (menuChoice == 0) {
                System.out.println("키오스크를 종료합니다. ");
                break;
            } else {
                System.out.println("잘못 입력하셨습니다. ");
                // 컨티뉴
            }
            // 4. 선택한 메뉴의 메뉴아이템리스트 보여주기
            // (메뉴아이템번호매기기 : int자료형 변수 선언 → for반복문: 변수가 리스트크기를 초과하지 않게 반복)
            int commend = 1;
            for (MenuItem menuItem : selectedMenu.getMenuItemList()){
                System.out.println(commend + ". " + menuItem.getName() + " | W "+ menuItem.getPrice() +" | "+ menuItem.getInformation());
                commend++;
            }
            System.out.print("어떤 메뉴아이템을 고르시겠습니까?: ");

            // 5. 메뉴아이템리스트 중 원하는 메뉴아이템 선택
            // 5-1 사용자가 입력한 메뉴아이템 번호받기
            int menuItemChoice = sc.nextInt();
            // 5-2 메뉴아이템리스트에 적혀있는 번호를 입력하기
            // if종결조건 : menuItemChoice가 0보다 크고, 메뉴아이템리스트 배열크기와 같거나 작은 숫자여야 한다
            if ( 0 < menuItemChoice && menuItemChoice <= selectedMenu.getMenuItemList().size()) {

            }
            // 6.메뉴아이템을 선택한 결과출력하기



        }



    }
}
