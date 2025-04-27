package lv3;

import java.util.List;
import java.util.Scanner;

// 프로그램 순서 및 흐름 제어를 담당하는 클래스
// 키오스크 프로그램의 메뉴를 관리하고 사용자 입력을 처리하는 클래스입니다.
public class Kiosk {
    // 속성
    private List<MenuItem> menuItems;


    // 생성자
    public Kiosk() {}   // 기본 생성자
    public Kiosk(List<MenuItem> menuItems) {
        this.menuItems = menuItems;
    }



    // 기능
    public void start() {   // 입력과 반복문 로직
        Scanner sc = new Scanner(System.in);

        while (true) {
            System.out.println("[ SHAKESHACK MENU ]");

            int menuNo = 1;

            // 터미널 줄 맞춤 필요
            for (MenuItem item : menuItems) {
                System.out.println(menuNo + ". | " + item.getName() + " | " + item.getPrice() + " | " + item.getInfo());
                ++menuNo;
            }
            System.out.println("0. 종료      | 종료");

            int option = sc.nextInt();

            if (option == 0) {
                System.out.println("프로그램을 종료합니다.");
                break;
            } else if (option >= 1 && option <= 4) {
                System.out.println(menuItems.get(option-1).getName() + ", " + menuItems.get(option-1).getPrice() + ", " + menuItems.get(option-1).getInfo());
            } else {
                System.out.println("메뉴에 없는 번호입니다.");
            }
        }
    }

    public List<MenuItem> getMenuItems() {
        return menuItems;
    }

    public void setMenuItems(List<MenuItem> menuItems) {
        this.menuItems = menuItems;
    }
}
