package model;

import java.util.Date;

public class Discount {
    public String discountID;
    public int discoutPercent;
    public Date startDate;
    public Date endDate;

    public  Discount(){

    }

    public Discount(String discountID, int discoutPercent, Date startDate, Date endDate) {
        this.discountID = discountID;
        this.discoutPercent = discoutPercent;
        this.startDate = startDate;
        this.endDate = endDate;
    }

    public String getDiscountID() {
        return discountID;
    }

    public void setDiscountID(String discountID) {
        this.discountID = discountID;
    }

    public int getDiscoutPercent() {
        return discoutPercent;
    }

    public void setDiscoutPercent(int discoutPercent) {
        this.discoutPercent = discoutPercent;
    }

    public Date getStartDate() {
        return startDate;
    }

    public void setStartDate(Date startDate) {
        this.startDate = startDate;
    }

    public Date getEndDate() {
        return endDate;
    }

    public void setEndDate(Date endDate) {
        this.endDate = endDate;
    }
}
