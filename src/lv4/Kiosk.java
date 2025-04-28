package lv4;

import java.util.List;
import java.util.Scanner;

// 프로그램 순서 및 흐름 제어를 담당하는 클래스
// 키오스크 프로그램의 메뉴를 관리하고 사용자 입력을 처리하는 클래스입니다.
public class Kiosk {
    private List<Menu> menus;

    Kiosk (List<Menu> menus) {
        this.menus = menus;
    }

    int start() {
        Scanner sc = new Scanner(System.in);

        System.out.println("[ MAIN MENU ]");
        for (int i = 0; i < menus.size(); i++) {
            System.out.println((i + 1) + ". " + menus.get(i).getCategory());
        }
        System.out.println("0. 종료");

        int option = sc.nextInt();

        if (option < 0 || option > menus.size())
            option = -1;

        return option;
    }
}
