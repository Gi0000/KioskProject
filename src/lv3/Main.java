package lv3;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<MenuItem> menuItems = new ArrayList<>();

        MenuItem menuItem1 = new MenuItem();
        menuItem1.setName("ShackBurger");
        menuItem1.setPrice(69000);
        menuItem1.setInfo("토마토, 양상추, 쉑소스가 토핑된 치즈버거");
        menuItems.add(menuItem1);

        MenuItem menuItem2 = new MenuItem();
        menuItem2.setName("SmokeShack");
        menuItem2.setPrice(89000);
        menuItem2.setInfo("베이컨, 체리 페퍼에 쉑소스가 토핑된 치즈버거");
        menuItems.add(menuItem2);

        MenuItem menuItem3 = new MenuItem();
        menuItem3.setName("Cheeseburger");
        menuItem3.setPrice(69000);
        menuItem3.setInfo("포테이토 번과 비프패티, 치즈가 토핑된 치즈버거");
        menuItems.add(menuItem3);

        MenuItem menuItem4 = new MenuItem();
        menuItem4.setName("Hamburger");
        menuItem4.setPrice(54000);
        menuItem4.setInfo("비프패티를 기반으로 야채가 들어간 기본버거");
        menuItems.add(menuItem4);

        Kiosk kiosk = new Kiosk(menuItems);
        kiosk.start();  // 사용자와의 상호작용 시작
    }
}
