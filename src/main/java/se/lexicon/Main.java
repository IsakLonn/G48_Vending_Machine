package se.lexicon;

import se.lexicon.util.ChocolateTaste;
import se.lexicon.util.Coins;
import se.lexicon.vending_machine.VendingMachineImpl;
import se.lexicon.model.ChocolateBar;
import se.lexicon.model.EnergyDrink;
import se.lexicon.model.Product;
import se.lexicon.model.Soda;

import java.util.Arrays;

public class Main {
    public static void main(String[] args){
        ChocolateBar bar = new ChocolateBar("mintChocolate", 10, ChocolateTaste.ORANGE, "a chocolate bar");
        Soda soda = new Soda("Soda", 19, 10, "a soda");
        EnergyDrink monster = new EnergyDrink("Monster", 25, 24, "a monster energy drink");

        Product[] products = {bar, soda, monster};
        VendingMachineImpl vendingMachine = new VendingMachineImpl(products);
        System.out.println("List of products available : ");
        System.out.println(
                Arrays.toString(vendingMachine.getProducts())
        );

        Product product = vendingMachine.request(2);
        String purchaseStatus = product!=null ? product.getProductName() : "Unable to get Product";
        System.out.println("Product returned : " + purchaseStatus);
        vendingMachine.addCurrency(Coins.ONE_HUNDRED);
        Product product1 = vendingMachine.request(2);
        String purchaseStatus1 = product1!=null ? product1.getProductName() : "Unable to get Product";
        System.out.println("Product returned : " + purchaseStatus1);
        System.out.println("Balance : " + vendingMachine.getBalance());
        vendingMachine.endSession();
        System.out.println("Balance :" + vendingMachine.getBalance());
    }
}
