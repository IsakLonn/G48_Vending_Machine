package se.lexicon.model;

import se.lexicon.util.StringHelper;

public abstract class Product {

    //variables
    private int id;
    private double price;
    private String productName;
    private String description;


    //setters
    public void setDescription(String description){
        if(StringHelper.isNullOrEmpty(description)) throw new IllegalArgumentException("Product description is null or empty");
        this.description = description;
    }
    public void setPrice(double price){
        this.price = price;
    }
    public int getId() {
        return id;
    }
    public void setProductName(String productName){
        if(StringHelper.isNullOrEmpty(productName)) throw new IllegalArgumentException("Product name is null or empty");
        this.productName = productName;
    }
    public void setId(int id){
        this.id = id;
    }

    //getters
    public String getDescription(){
        return description;
    }
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
    public Product(String productName, double price, int id, String description)
    {
        setDescription(description);
        setId(id);
        setPrice(price);
        setProductName(productName);
    }

}

