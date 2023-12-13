package se.lexicon.util;

public enum ProductId {
    CHOCOLATE(1),
    SODA(2),
    ENERGYDRINK(3);

    private int id;

    public int getId(){return id;}
    private ProductId(int id)
    {
        this.id = id;
    }
}
/* public VendingMachine(){
products= new Product[]{
        Product.CHOCOLATE,
        Product.SODA,
        Product.ENERGY_DRINK
        }

 */