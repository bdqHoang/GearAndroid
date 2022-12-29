package model;

import java.util.Date;
import java.util.List;

public class Invoice {
    public String invoiceID;
    public String discountID;
    public int total;
    public int totalDiscount;
    public int totalPayment;
    public Date createdAt;
    public List<orderDetail> listProduct;

    public Invoice(){

    }

    public Invoice(String invoiceID, String discountID, int total, int totalDiscount, int totalPayment, Date createdAt, List<orderDetail> listProduct) {
        this.invoiceID = invoiceID;
        this.discountID = discountID;
        this.total = total;
        this.totalDiscount = totalDiscount;
        this.totalPayment = totalPayment;
        this.createdAt = createdAt;
        this.listProduct = listProduct;
    }

    public String getInvoiceID() {
        return invoiceID;
    }

    public void setInvoiceID(String invoiceID) {
        this.invoiceID = invoiceID;
    }

    public String getDiscountID() {
        return discountID;
    }

    public void setDiscountID(String discountID) {
        this.discountID = discountID;
    }

    public int getTotal() {
        return total;
    }

    public void setTotal(int total) {
        this.total = total;
    }

    public int getTotalDiscount() {
        return totalDiscount;
    }

    public void setTotalDiscount(int totalDiscount) {
        this.totalDiscount = totalDiscount;
    }

    public int getTotalPayment() {
        return totalPayment;
    }

    public void setTotalPayment(int totalPayment) {
        this.totalPayment = totalPayment;
    }

    public Date getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(Date createdAt) {
        this.createdAt = createdAt;
    }

    public List<orderDetail> getListProduct() {
        return listProduct;
    }

    public void setListProduct(List<orderDetail> listProduct) {
        this.listProduct = listProduct;
    }
}
