package lv4AndLv5;

// 세부 메뉴 속성 가지는 클래스
public class MenuItem {
    // 이름, 가격, 설명 필드 선언하여 관리
    private String name;
    private int price;
    private String info;

    // 생성자
    MenuItem(String name, int price, String info) {
        this.name = name;
        this.price = price;
        this.info = info;
    }

    public String getName() {
        return name;
    }

    public int getPrice() {
        return price;
    }

    public String getInfo() {
        return info;
    }
}

