package se.lexicon;

public interface IVendingMachine {
    Product request(int id);
    String[] getProducts();
    String getDescription(int id);
    int endSession();
    void addCurrency(int amount);
    int getBalance();
}
