package challenge;

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

    // List에 들어있는 MenuItem을 순차적으로 보여주는 함수
    void showMenuItems(ShoppingCart shoppingCart) {
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
        } else if (option >= 1 && option <= menuItems.size()) {
            System.out.println("선택한 메뉴: " + menuItems.get(option - 1).getName() + " | " + menuItems.get(option - 1).getPrice() + " | " + menuItems.get(option - 1).getInfo());
            System.out.println(); // 줄바꿈
            System.out.println("\"" + menuItems.get(option - 1).getName() + " | " + menuItems.get(option - 1).getPrice() + " | " + menuItems.get(option - 1).getInfo() + "\"");
            System.out.println("위 메뉴를 장바구니에 추가하시겠습니까?");
            System.out.println("1. 확인\t2. 취소");

            int select = sc.nextInt();

            if (select == 1) {
                shoppingCart.addShoppingCart(menuItems.get(option - 1));
            }
            if (select == 2) {
                System.out.println("메뉴판으로 이동합니다.");
            }
        } else {
            System.out.println("메뉴에 없는 번호입니다.");
        }
    }
}
