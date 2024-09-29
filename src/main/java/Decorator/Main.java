package Decorator;


public class Main {
    public static void main(String[] args) {
        Product milk = new Product("Milk", 20.0, 6);
        Product bread = new Product("Bread", 15.0, 2);

        Discount discountChain = new FridayDiscount(new MilkDiscount(new QuantityDiscount(null)));

        System.out.println("Milk discount: " + discountChain.apply(milk));
        System.out.println("Milk discount description: " + discountChain.getDescription(milk));

        System.out.println("Bread discount: " + discountChain.apply(bread));
        System.out.println("Bread discount description: " + discountChain.getDescription(bread));
    }
}