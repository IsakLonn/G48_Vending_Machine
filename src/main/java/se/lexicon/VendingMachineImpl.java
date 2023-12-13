package se.lexicon;

import java.sql.SQLOutput;
import java.util.Arrays;

public class VendingMachineImpl implements IVendingMachine{

    Product[] products;
    int depositPool;

    public VendingMachineImpl(Product[] products) {
        this.products = products;
    }

    @Override
    public Product request(int id) {
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
            productsList[i] = products[i].getProductName();
        }
        return productsList;
    }



    @Override
    public String getDescription(int id) {
        Product productMatched = request(id);
        if(productMatched != null) {
            return productMatched.getProductName();
        }
        return null;
    }

    @Override
    public int endSession() {
        return 0;
    }

    @Override
    public void addCurrency(int amount) {
        depositPool = depositPool + amount;
    }

    @Override
    public int getBalance() {
        return 0;
    }
}
