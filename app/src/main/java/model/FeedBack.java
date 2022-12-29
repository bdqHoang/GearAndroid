package model;

import java.util.Date;

public class FeedBack {
    public String feedBackID;
    public String userID;
    public int ratting;
    public String comment;
    public Date dateComment;

    public FeedBack(){

    }

    public FeedBack(String feedBackID, String userID, int ratting, String comment, Date dateComment) {
        this.feedBackID = feedBackID;
        this.userID = userID;
        this.ratting = ratting;
        this.comment = comment;
        this.dateComment = dateComment;
    }

    public String getFeedBackID() {
        return feedBackID;
    }

    public void setFeedBackID(String feedBackID) {
        this.feedBackID = feedBackID;
    }

    public String getUserID() {
        return userID;
    }

    public void setUserID(String userID) {
        this.userID = userID;
    }


    public int getRatting() {
        return ratting;
    }

    public void setRatting(int ratting) {
        this.ratting = ratting;
    }

    public String getComment() {
        return comment;
    }

    public void setComment(String comment) {
        this.comment = comment;
    }

    public Date getDateComment() {
        return dateComment;
    }

    public void setDateComment(Date dateComment) {
        this.dateComment = dateComment;
    }
}
