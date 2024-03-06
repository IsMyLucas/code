public class Supermarket {
    private static final int APPLE_PRICE = 8;  // 苹果价格，单位：元/斤
    private static final int STRAWBERRY_PRICE = 13;  // 草莓价格，单位：元/斤
    private static final int MANGO_PRICE = 10;  // 芒果价格，单位：元/斤
    private static final double STRAWBERRY_DISCOUNT = 0.8;  // 草莓打折
    private static final int DISCOUNT_THRESHOLD = 100;  // 满减门槛，单位：元
    private static final int DISCOUNT_AMOUNT = 10;  // 满减金额，单位：元

    /**
     * 1、有一家超市，出售苹果和草莓。其中苹果 8 元/斤，草莓 13 元/斤。
     * 现在顾客 A 在超市购买了若干斤苹果和草莓，需要计算一共多少钱？
     * 请编写函数，对于 A 购买的水果斤数 (水果斤数为大于等于 0 的整数)，计算并返回所购买商品的总价。
     * @param apples
     * @param strawberries
     * @return
     */
    public static double calculateTotalPriceA(int apples, int strawberries) {
        if (apples < 0 || strawberries < 0) {
            throw new IllegalArgumentException("水果斤数不能为负数");
        }

        double totalApplePrice = apples * APPLE_PRICE;
        double totalStrawberryPrice = strawberries * STRAWBERRY_PRICE;
        return totalApplePrice + totalStrawberryPrice;
    }

    /**
     * 2、超市增加了一种水果芒果，其定价为 20 元/斤。
     * 现在顾客 B 在超市购买了若干斤苹果、 草莓和芒果，需计算一共需要多少钱？
     * 请编写函数，对于 B 购买的水果斤数 (水果斤数为大于等于 0 的整数)，计算并返回所购买商品的总价。
     * @param apples
     * @param strawberries
     * @param mangos
     * @return
     */
    public static double calculateTotalPriceB(int apples, int strawberries, int mangos) {
        if (apples < 0 || strawberries < 0 || mangos < 0) {
            throw new IllegalArgumentException("水果斤数不能为负数");
        }

        double totalApplePrice = apples * APPLE_PRICE;
        double totalStrawberryPrice = strawberries * STRAWBERRY_PRICE;
        double totalMangoPrice = mangos * MANGO_PRICE;
        double totalPrice = totalApplePrice + totalStrawberryPrice + totalMangoPrice;

        return totalPrice;
    }

    /**
     * 3、超市做促销活动，草莓限时打 8 折。
     * 现在顾客 C 在超市购买了若干斤苹果、 草莓和芒果，需计算一共需要多少钱？
     * 请编写函数，对于 C 购买的水果斤数 (水果斤数为大于等于 0 的整数)，计算并返回所购买商品的总价。
     * @param apples
     * @param strawberries
     * @param mangos
     * @return
     */
    public static double calculateTotalPriceC(int apples, int strawberries, int mangos) {
        if (apples < 0 || strawberries < 0 || mangos < 0) {
            throw new IllegalArgumentException("水果斤数不能为负数");
        }

        double totalApplePrice = apples * APPLE_PRICE;
        double totalStrawberryPrice = strawberries * STRAWBERRY_PRICE * STRAWBERRY_DISCOUNT;
        double totalMangoPrice = mangos * MANGO_PRICE;
        return totalApplePrice + totalStrawberryPrice + totalMangoPrice;
    }

    /**
     * 4、促销活动效果明显，超市继续加大促销力度，购物满 100 减 10 块。
     * 现在顾客 D 在超市购买了若干斤苹果、 草莓和芒果，需计算一共需要多少钱？
     * 请编写函数，对于 D 购买的水果斤数 (水果斤数为大于等于 0 的整数)，计算并返回所购买商品的总价。
     * @param apples
     * @param strawberries
     * @param mangos
     * @return
     */
    public static double calculateTotalPriceD(int apples, int strawberries, int mangos) {
        if (apples < 0 || strawberries < 0 || mangos < 0) {
            throw new IllegalArgumentException("水果斤数不能为负数");
        }

        double totalApplePrice = apples * APPLE_PRICE;
        double totalStrawberryPrice = strawberries * STRAWBERRY_PRICE;
        double totalMangoPrice = mangos * MANGO_PRICE;
        double totalPrice = totalApplePrice + totalStrawberryPrice + totalMangoPrice;

        if (totalPrice >= DISCOUNT_THRESHOLD) {
            totalPrice -= DISCOUNT_AMOUNT * (int)(totalPrice / DISCOUNT_THRESHOLD);
        }

        return totalPrice;
    }

    public static void main(String[] args) {
        // 1
//        int apples = 5;  // 苹果斤数
//        int strawberries = 3;  // 草莓斤数
//        int totalPrice = calculateTotalPriceA(apples, strawberries); // 5*8+3*13=79
//        System.out.println("购买 " + apples + " 斤苹果和 " + strawberries + " 斤草莓的总价为：" + totalPrice + " 元");

        // 2
//        int apples = 5;  // 苹果斤数
//        int strawberries = 3;  // 草莓斤数
//        int mangos = 2;  // 芒果斤数
//        double totalPrice = calculateTotalPriceB(apples, strawberries, mangos); // 5*8+3*13+2*10=99
//        System.out.println("购买 " + apples + " 斤苹果、" + strawberries + " 斤草莓和 " + mangos + " 斤芒果的总价为：" + totalPrice + " 元");

        // 3
//        int apples = 5;  // 苹果斤数
//        int strawberries = 3;  // 草莓斤数
//        int mangos = 2;  // 芒果斤数
//        double totalPrice = calculateTotalPriceC(apples, strawberries, mangos); // 5*8+3*13*0.8+2*10=91.2
//        System.out.println("购买 " + apples + " 斤苹果、" + strawberries + " 斤草莓和 " + mangos + " 斤芒果的总价为：" + totalPrice + " 元");

        // 4
//        int apples = 10;  // 苹果斤数
//        int strawberries = 6;  // 草莓斤数
//        int mangos = 6;  // 芒果斤数
//        double totalPrice = calculateTotalPriceD(apples, strawberries, mangos); // 10 * 8 + 6 * 13 + 6 * 10 = 198
//        System.out.println("购买 " + apples + " 斤苹果、" + strawberries + " 斤草莓和 " + mangos + " 斤芒果的总价为：" + totalPrice + " 元");
    }
}
