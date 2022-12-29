package model;

public class Product {
    public String productID;
    public String productName;
    public float ratting;
    public int numberOfRatting;
    public int importPrice;
    public int sellPrice;
    public String suplierName;
    public String description;

    public Product(){

    }

    public Product(String productID, String productName, float ratting, int numberOfRatting, int importPrice, int sellPrice, String suplierName, String description) {
        this.productID = productID;
        this.productName = productName;
        this.ratting = ratting;
        this.numberOfRatting = numberOfRatting;
        this.importPrice = importPrice;
        this.sellPrice = sellPrice;
        this.suplierName = suplierName;
        this.description = description;
    }

    public String getProductID() {
        return productID;
    }

    public void setProductID(String productID) {
        this.productID = productID;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public float getRatting() {
        return ratting;
    }

    public void setRatting(float ratting) {
        this.ratting = ratting;
    }

    public int getNumberOfRatting() {
        return numberOfRatting;
    }

    public void setNumberOfRatting(int numberOfRatting) {
        this.numberOfRatting = numberOfRatting;
    }

    public int getImportPrice() {
        return importPrice;
    }

    public void setImportPrice(int importPrice) {
        this.importPrice = importPrice;
    }

    public int getSellPrice() {
        return sellPrice;
    }

    public void setSellPrice(int sellPrice) {
        this.sellPrice = sellPrice;
    }

    public String getSuplierName() {
        return suplierName;
    }

    public void setSuplierName(String suplierName) {
        this.suplierName = suplierName;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
