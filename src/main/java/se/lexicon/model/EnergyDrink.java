package se.lexicon.model;

import se.lexicon.util.ProductId;

public class EnergyDrink extends Product{

    private int sugarAmount;

    public int getSugarAmount() { return sugarAmount; }

    public void setSugarAmount(int sugarAmount) { this.sugarAmount = sugarAmount; }

    public EnergyDrink(String productName, double price, int sugarAmount, String description) {
        super(productName, price, ProductId.ENERGYDRINK.getId(), description);
        setSugarAmount(sugarAmount);
    }

    @Override
    public String examine() {
        return "An energy drink with " + getSugarAmount() + " amount of sugar";
    }

    @Override
    public String use() {
        return "You drink the energy drink. You feel energy welling up";
    }
}
