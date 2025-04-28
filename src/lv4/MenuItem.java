package lv4;

import java.util.List;
import java.util.Scanner;

// 세부 메뉴 속성 가지는 클래스
public class MenuItem {
    // 이름, 가격, 설명 필드 선언하여 관리
    private String name;
    private int price;
    private String info;

    // 생성자
    MenuItem() {}
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

    // 구조에 맞게 함수를 선언해놓고 가져다 사용하세요.



}

