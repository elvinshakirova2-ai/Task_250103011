package com.ecommerce;

public class takeOrder{
    private final CheckoutFacade checkout = new CheckoutFacade();
     public int order(int productId, int amount){
        if(amount<=0){
            System.out.println("Incorrect amount:"+amount);
            return 0;
        }
        if(!isLegit(productId, amount)){
            System.out.println("");
            return 0;
    }
         boolean ok =checkout.placeOrder(String.valueOf(productId), "user", "address",amount);

        return ok?1:0;
}
    private boolean isLegit(int productId, int amount){
        return productId >0&& amount<=100000;
    }
}
