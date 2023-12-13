package se.lexicon;

public abstract class Product {

    //variables
    private int id;
    private double price;
    private String productName;

    //setters
    public void setPrice(double price){
        this.price = price;
    }
    public int getId() {
        return id;
    }
    public void setProductName(String productName){
        if(StringHelper.isNullOrEmpty(productName)) throw new IllegalArgumentException("Product name as null or empty");
        this.productName = productName;
    }
    public void setId(int id){
        this.id = id;
    }

    //getters
    public double getPrice(){
        return price;
    }
    public String getProductName(){
        return productName;
    }

    //abstracts
    public abstract String examine();
    public abstract String use();

    //constructor
    public Product(String productName, double price, int id)
    {
        setId(id);
        setPrice(price);
        setProductName(productName);
    }

}

