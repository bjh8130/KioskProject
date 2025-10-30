package lv2;

public class MenuItem {

    //속성
    // 5. 햄버거를 관리하는 클래스 및 필드 생성 (이름, 가격, 설명)
    // private 사용으로 속성보호 -> 외부에서 접근 차단 (캡슐화)
    private String name;
    private double price;
    private String information;


    //생성자 9. MenuItem 객체 생성을 통해 이름, 가격, 설명을 세팅
    public MenuItem(String name, double price, String information) {
        this.name = name;
        this.price = price;
        this.information = information;
    }


    //기능
    // 6. main에서 호출 시 햄버거 메뉴를 출력하는 기능구현 -> 12
    // 13. 컬렉션을 활용해서 출력할 때, 가져와야하는 이름, 가격, 설명에 대한 게터를 생성
    public String getName() {
        return this.name;
    }
    public double getPrice() {
        return this.price;
    }
    public String getInformation() {
        return this.information;
    }

}
