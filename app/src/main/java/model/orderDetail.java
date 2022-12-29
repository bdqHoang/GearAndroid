package model;

public class orderDetail {
    public String productID;
    public String customerID;
    public int quantity;
    public int sellPrice;

    public orderDetail(){

    }

    public orderDetail(String productID, String customerID, int quantity, int sellPrice) {
        this.productID = productID;
        this.customerID = customerID;
        this.quantity = quantity;
        this.sellPrice = sellPrice;
    }

    public String getProductID() {
        return productID;
    }

    public void setProductID(String productID) {
        this.productID = productID;
    }

    public String getCustomerID() {
        return customerID;
    }

    public void setCustomerID(String customerID) {
        this.customerID = customerID;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public int getSellPrice() {
        return sellPrice;
    }

    public void setSellPrice(int sellPrice) {
        this.sellPrice = sellPrice;
    }
}
