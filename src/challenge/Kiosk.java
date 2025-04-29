package challenge;

import java.util.List;
import java.util.Scanner;

// 프로그램 순서 및 흐름 제어를 담당하는 클래스
// 키오스크 프로그램의 메뉴를 관리하고 사용자 입력을 처리하는 클래스입니다.
public class Kiosk {
    private List<Menu> menus;

    Kiosk (List<Menu> menus) {
        this.menus = menus;
    }

    void start(ShoppingCart shoppingCart) {
        while(true) {
            Scanner sc = new Scanner(System.in);
            int option = 0;

            if (!shoppingCart.getShoppingCartList().isEmpty()) {
                System.out.println("[ MAIN MENU ]");
                for (int i = 0; i < menus.size(); i++) {
                    System.out.println((i + 1) + ". " + menus.get(i).getCategory());
                }
                System.out.println("0. 종료");
                System.out.println();
                System.out.println("[ ORDERS MENU ]");
                System.out.println("4. Orders");
                System.out.println("5. Cancel");

                option = sc.nextInt();

                if (option == 0) {
                    System.out.println("프로그램을 종료합니다.");
                    break;
                }
                else if (option < 0 || option > menus.size() + 2) {
                    System.out.println("메뉴에 없는 번호입니다.");
                }
                else if (option == menus.size() + 1) {
                    System.out.println("아래와 같이 주문 하시겠습니까?");
                    System.out.println();
                    shoppingCart.showShoppingCart();
                    System.out.println();
                    System.out.println("[ Total ]");
                    System.out.println("W " + shoppingCart.totalPrice());
                    System.out.println();
                    System.out.println("1. 주문\t2. 메뉴판");
                    int select = sc.nextInt();
                    if (select == 1) {
                        shoppingCart.order();
                        break;
                    }
                }
                else if (option == menus.size() + 2) {
                    shoppingCart.deleteShoppingCart();
                }
                else {
                    // showMenuItems function
                    Menu selectMenu = menus.get(option - 1);
                    System.out.println("[ " + selectMenu.getCategory().toUpperCase() + " MENU ]");
                    selectMenu.showMenuItems(shoppingCart);
                }

            } else {
                System.out.println("[ MAIN MENU ]");
                for (int i = 0; i < menus.size(); i++) {
                    System.out.println((i + 1) + ". " + menus.get(i).getCategory());
                }
                System.out.println("0. 종료");

                option = sc.nextInt();
                if (option == 0) {
                    System.out.println("프로그램을 종료합니다.");
                    break;
                }
                if (option < 0 || option > menus.size() + 2) {
                    System.out.println("메뉴에 없는 번호입니다.");
                    continue;
                }
                if (option == menus.size() || option == menus.size() + 1) {
                    System.out.println("장바구니가 비어있습니다.");
                }

                // showMenuItems function
                Menu selectMenu = menus.get(option - 1);
                System.out.println("[ " + selectMenu.getCategory().toUpperCase() + " MENU ]");
                selectMenu.showMenuItems(shoppingCart);
            }

        }
    }
}
