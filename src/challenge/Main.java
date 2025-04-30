package challenge;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        // Menu 클래스 내 있는 List<MenuItem> 에 MenuItem 객체 생성하면서 삽입
        // 버거 메뉴 생성
        Menu burgerMenu = new Menu("Burgers");
        burgerMenu.addMenuItem(new MenuItem("ShackBurger", 6900, "토마토, 양상추, 쉑소스가 토핑된 치즈버거"));
        burgerMenu.addMenuItem(new MenuItem("SmokeShack", 8900, "베이컨, 체리 페퍼에 쉑소스가 토핑된 치즈버거"));
        burgerMenu.addMenuItem(new MenuItem("Cheeseburger", 6900, "포테이토 번과 비프패티, 치즈가 토핑된 치즈버거"));
        burgerMenu.addMenuItem(new MenuItem("Hamburger", 5400, "비프패티를 기반으로 야채가 들어간 기본버거"));

        // 음료 메뉴 생성
        Menu drinkMenu = new Menu("Drinks");
        drinkMenu.addMenuItem(new MenuItem("콜라", 1000, "시원한 탄산음료"));
        drinkMenu.addMenuItem(new MenuItem("사이다", 1000, "톡 쏘는 탄산음료"));

        // 디저트 메뉴 생성
        Menu dessertMenu = new Menu("Desserts");
        dessertMenu.addMenuItem(new MenuItem("아이스크림", 1000, "부드러운 아이스크림"));
        dessertMenu.addMenuItem(new MenuItem("쿠키", 1000, "달콤한 초코칩 쿠키"));

        // Menu 객체 생성을 통해 이름 설정
        List<Menu> menus = new ArrayList<>();
        menus.add(burgerMenu);
        menus.add(drinkMenu);
        menus.add(dessertMenu);

        // Kiosk 객체 생성
        Kiosk kiosk = new Kiosk(menus);
        UserType userType = UserType.GENERAL;
        ShoppingCart shoppingCart = new ShoppingCart(userType);

        // Kiosk 내 시작하는 함수 호출
        kiosk.start(shoppingCart);
    }
}
