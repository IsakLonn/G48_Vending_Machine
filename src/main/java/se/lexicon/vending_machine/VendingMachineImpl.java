package se.lexicon.vending_machine;

import se.lexicon.util.Coins;
import se.lexicon.model.Product;

public class VendingMachineImpl implements IVendingMachine{

    Product[] products;
    int depositPool;

    public VendingMachineImpl(Product[] products) {
        this.products = products;
    }

    @Override
    public Product request(int id) {
        Product product = getProductById(id);
        if(product.getPrice() <= depositPool)
        {
            depositPool -= product.getPrice();
            return product;
        }
        return null;
    }

    private Product it (int id) {
        for(Product product : products) {
            if(id == product.getId()) {
                return product;
            }
        }
        return null;
    }

    @Override
    public String[] getProducts() {
        String [] productsList = new String[products.length];
        for (int i = 0; i < products.length; i++) {
            productsList[i] = products[i].getId() + " " + products[i].getProductName() + " " + products[i].getPrice();
        }
        return productsList;
    }



    @Override
    public String getDescription(int id) {
        Product productMatched = getProductById(id);
        if(productMatched != null) {
            return productMatched.getDescription();
        }
        return null;
    }

    @Override
    public int endSession() {
        int value = depositPool;
        depositPool = 0;
        return value;
    }

    @Override
    public void addCurrency(Coins amount) {
        depositPool = depositPool + amount.getValue();
    }

    @Override
    public int getBalance() {
        return depositPool;
    }
}
