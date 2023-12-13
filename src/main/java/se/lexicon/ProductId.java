package se.lexicon;

public enum ProductId {
    CHOCOLATE(3),
    SODA(2),
    ENERGYDRINK(1);

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