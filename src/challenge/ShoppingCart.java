package challenge;

import java.util.ArrayList;
import java.util.List;

public class ShoppingCart {

// 속성
    private List<MenuItem> ShoppingCartList = new ArrayList<>();
    private String name;
    private int amount;
    private int price;

// 생성자
    ShoppingCart() {}

    public List<MenuItem> getShoppingCartList() {
        return ShoppingCartList;
    }

    public String getName() {
        return name;
    }

// 기능
    // 추가
    void addShoppingCart(MenuItem menuItem) {
        ShoppingCartList.add(menuItem);
        System.out.println(menuItem.getName() + " 이 장바구니에 추가되었습니다.");
    }

    // 조회
    void showShoppingCart() {
        System.out.println("[ Orders ]");
        for (int i = 0; i < ShoppingCartList.size(); i++) {
            MenuItem menuItem = ShoppingCartList.get(i);
            System.out.println(menuItem.getName() + " | " + menuItem.getPrice() + " | " + menuItem.getInfo());
        }
    }

    // 삭제
    void deleteShoppingCart() {
        for (int i = ShoppingCartList.size() - 1; i >= 0; i--) {
            ShoppingCartList.remove(i);
        }
        System.out.println("장바구니 삭제");
    }

    // 결제 전 출력
    int totalPrice() {
        int total = 0;
        for (int i = 0; i < ShoppingCartList.size(); i++) {
            total += ShoppingCartList.get(i).getPrice();
        }
        return total;
    }

    // 주문
    void order() {
        System.out.println("주문이 완료되었습니다. 금액은 W " + totalPrice() + "입니다.");
    }
}
