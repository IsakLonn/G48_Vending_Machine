package se.lexicon;

import java.util.Arrays;

public class Main {
    public static void main(String[] args){
        ChocolateBar bar = new ChocolateBar("mintChocolate", 10, ChocolateTaste.ORANGE);
        ChocolateBar bar2 = new ChocolateBar("mintChocolate", 10, ChocolateTaste.MINT);
        Soda soda = new Soda("Soda", 19, 10);
        EnergyDrink monster = new EnergyDrink("Monster", 25, 24);
        System.out.println("Chocolate bar:");
        System.out.println(bar.getTaste());
        System.out.println(bar2.getId());

        System.out.println("Soda:");
        System.out.println(soda.getSize());

        System.out.println("Energy drink:");
        System.out.println(monster.getProductName());

        Product [] products = {bar, soda, monster};
        VendingMachineImpl vendingMachine = new VendingMachineImpl(products);
        System.out.println(
                Arrays.toString(vendingMachine.getProducts())
        );
        System.out.println("Product Description :" +  vendingMachine.getDescription(2));
        System.out.println("Get product by id : " + vendingMachine.request(1).toString());
    }
}