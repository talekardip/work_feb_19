package com.practice2;

public class Test {
    public static void summary(Product[] Cart){
        System.out.println("Summary of your cart:");
        for(Product p:Cart) {
            System.out.println(p);
        }
    }

    public static double totalPrice(Product[] Cart){
        double tot = 0;
        for(Product p: Cart){
            tot+=p.getPrice();
        }
        return tot;
    }

    public static void main(String[] args) {
        Product[] Cart = new Product[]{
                new Product("PID1","Shoes",2000),
                new Product("PID6","Pant",2234),
                new Product("PID5","Trimmer",1000)

        };

        summary(Cart);
        System.out.println("Total Price is "+totalPrice(Cart));
    }
}
