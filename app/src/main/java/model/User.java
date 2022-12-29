package model;

public class User {
    public  String userId;
    public String userName;
    public String phone;
    public String email;
    public String password;
    public String address;
    public String urlImage;

    public User(){

    }

    public User(String userId, String userName, String phone, String email, String password, String address, String urlImage) {
        this.userId = userId;
        this.userName = userName;
        this.phone = phone;
        this.email = email;
        this.password = password;
        this.address = address;
        this.urlImage = urlImage;
    }

    public String getuserId() {
        return userId;
    }

    public void setuserId(String userId) {
        this.userId = userId;
    }

    public String getuserName() {
        return userName;
    }

    public void setuserName(String userName) {
        this.userName = userName;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getUrlImage() {
        return urlImage;
    }

    public void setUrlImage(String urlImage) {
        this.urlImage = urlImage;
    }
}
