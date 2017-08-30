package domain;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * Created by WLP on 2017/8/1.
 */
public class User {

    private String userName;
    private String userId;
    private String password;
    private String sex;
    private String email;
    private String phone;
    private String date;

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getUserId() {
        return userId;
    }

    public String creatId(){
        String userId = "";
        SimpleDateFormat sdf = new SimpleDateFormat("yyyyMMdd");
        String temp = sdf.format(new Date());
        int random = (int)((Math.random()+1)*100);
        userId = temp + random;
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    @Override
    public String toString() {
        return "User{" +
                "userName='" + userName + '\'' +
                ", userId='" + userId + '\'' +
                ", password='" + password + '\'' +
                ", sex='" + sex + '\'' +
                ", email='" + email + '\'' +
                ", phone='" + phone + '\'' +
                ", date='" + date + '\'' +
                '}';
    }

}
