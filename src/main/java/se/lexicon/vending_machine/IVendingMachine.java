package se.lexicon.vending_machine;

import se.lexicon.util.Coins;
import se.lexicon.model.Product;

public interface IVendingMachine {
    Product request(int id);
    String[] getProducts();
    String getDescription(int id);
    int endSession();
    void addCurrency(Coins amount);
    int getBalance();
}
