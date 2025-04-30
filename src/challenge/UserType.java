package challenge;

public enum UserType {
    NATIONAL(0.9),
    SOLDIER(0.95),
    STUDENT(0.97),
    GENERAL(1);

    private final double discountRate;

    UserType(double discountRate) {
        this.discountRate = discountRate;
    }

    public double getDiscountRate() {
        return discountRate;
    }

    double discountCal(int option, int totalPrice) {
        UserType userType = UserType.GENERAL;;

        switch (option) {
            case 1:
                userType = UserType.NATIONAL;
                break;
            case 2:
                userType = UserType.SOLDIER;
                break;
            case 3:
                userType = UserType.STUDENT;
                break;
            case 4:
                userType = UserType.GENERAL;
                break;
            default:
                System.out.println("잘못된 번호");
        }

        double totalPriceAfterDiscount = totalPrice * userType.getDiscountRate();
        return totalPriceAfterDiscount;
    }
}
