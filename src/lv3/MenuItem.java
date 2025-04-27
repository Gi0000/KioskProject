package lv3;

// 세부 메뉴 속성 가지는 클래스
public class MenuItem {
    // 속성
    private String name;
    private int price;
    private String info;

    // 생성자
    public MenuItem() {}
    public MenuItem(String name, int price, String info) {
        this.name = name;
        this.price = price;
        this.info = info;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public String getInfo() {
        return info;
    }

    public void setInfo(String info) {
        this.info = info;
    }
}
