package lv4;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

// MenuItem 클래스를 관리하는 클래스
public class Menu {
    // 속성
    private String category;

    // MenuItem 클래스를 List로 관리
    private List<MenuItem> menuItems;

    // 생성자
    Menu () {}
    Menu (String category) {
        this.category = category;
        this.menuItems = new ArrayList<>();
    }

    // 기능
    public String getCategory() {
        return category;
    }
    void addMenuItem(MenuItem item) {
        menuItems.add(item);
    }

    // List를 리턴하는 함수
    List<MenuItem> returnMenuItemList (int option, List<Menu> menus) {
        return (List<MenuItem>) menus.get(option - 1);
    }

    // List에 들어있는 MenuItem을 순차적으로 보여주는 함수
    void showMenuItems() {
        while(true) {
            Scanner sc = new Scanner(System.in);

            int menuNo = 1;

            // 터미널 줄 맞춤 필요
            for (MenuItem item : menuItems) {
                System.out.println(menuNo + ". " + item.getName() + " | " + item.getPrice() + " | " + item.getInfo());
                ++menuNo;
            }
            System.out.println("0. 뒤로가기");

            int option = sc.nextInt();

            if (option == 0) {
                break;
            } else if (option >= 1 && option <= menuItems.size()) {
                System.out.println(menuItems.get(option - 1).getName() + ", " + menuItems.get(option - 1).getPrice() + ", " + menuItems.get(option - 1).getInfo());
            } else {
                System.out.println("메뉴에 없는 번호입니다.");
            }
        }
    }
}
