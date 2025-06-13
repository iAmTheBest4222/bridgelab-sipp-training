public class Qnine {
    public static void main(String[] args) {
        int fee = 125000;
        int discountPercent = 10;
        int discount = (fee * discountPercent) / 100;
        int payableFee = fee - discount;
        System.out.println("the discount ammount " + discount + " and final discounted fee in INR " + payableFee);

    }
}
