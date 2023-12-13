package se.lexicon.model;

import se.lexicon.util.ProductId;

public class Soda extends Product{

    private int size;

    public Soda(String productName, double price, int size, String description) {
        super(productName, price, ProductId.SODA.getId(), description);
        setSize(size);
    }

    public int getSize() { return size; }

    public void setSize(int size) { this.size = size; }

    @Override
    public String examine() {
        return "Soda - Coke";
    }
    @Override
    public String use(){
        return "Coke Delivered";
    }
}
