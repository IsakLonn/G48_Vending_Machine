package se.lexicon;

public class Soda extends Product{

    private int size;

    public Soda(String productName, double price, int size) {
        super(productName, price, ProductId.SODA.getId());
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
