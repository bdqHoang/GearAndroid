package model;

public class Cart {
    public String userID;
    public String productID;
    public String quantity;

    public  Cart(){

    }
    public Cart(String userID, String productID, String quantity) {
        this.userID = userID;
        this.productID = productID;
        this.quantity = quantity;
    }

    public String getuserID() {
        return userID;
    }

    public void setuserID(String userID) {
        this.userID = userID;
    }

    public String getProductID() {
        return productID;
    }

    public void setProductID(String productID) {
        this.productID = productID;
    }

    public String getQuantity() {
        return quantity;
    }

    public void setQuantity(String quantity) {
        this.quantity = quantity;
    }
}
