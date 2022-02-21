package com.estal.Estal.entity;



import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.sql.Timestamp;
import java.util.Date;

@Entity
@Table(name = "`USER_SIGNUP`")
public class UserEntity {
    @Id
    @Column(name = "`USER_ID`")
    public int user_id;

    @Column(name = "`USER-NAME`")
    public String user_name;

    @Column(name = "`EMAIL`")
    public String email;

    @Column(name = "`PASSWORD`")
    public String password;

    @Column(name = "`DATE-OF-BIRTH`")
    public Date dob;

    @Column(name = "`ADDRESS`")
    public String address;

    @Column(name = "`MOBILE-NUMBER`")
    public int mobile_number;

    @Column(name = "`TIMESTAMP`")
    public Timestamp timeStamp;

    @Column(name = "`LOGIN-FAILED`")
    public int login_failed;

    @Column(name = "`GROUP-BY`")
    public String group_by;


    public UserEntity() {

    }

    public UserEntity(int user_id, java.lang.String user_name, java.lang.String email, java.lang.String password, Date dob, java.lang.String address, int mobile_number, Timestamp timeStamp, int login_failed, java.lang.String group_by) {
        this.user_id = user_id;
        this.user_name = user_name;
        this.email = email;
        this.password = password;
        this.dob = dob;
        this.address = address;
        this.mobile_number = mobile_number;
        this.timeStamp = timeStamp;
        this.login_failed = login_failed;
        this.group_by = group_by;
    }

    public int getUser_id() {
        return user_id;
    }

    public void setUser_id(int user_id) {
        this.user_id = user_id;
    }

    public java.lang.String getUser_name() {
        return user_name;
    }

    public void setUser_name(java.lang.String user_name) {
        this.user_name = user_name;
    }

    public java.lang.String getEmail() {
        return email;
    }

    public void setEmail(java.lang.String email) {
        this.email = email;
    }

    public java.lang.String getPassword() {
        return password;
    }

    public void setPassword(java.lang.String password) {
        this.password = password;
    }

    public Date getDob() {
        return dob;
    }

    public void setDob(Date dob) {
        this.dob = dob;
    }

    public java.lang.String getAddress() {
        return address;
    }

    public void setAddress(java.lang.String address) {
        this.address = address;
    }

    public int getMobile_number() {
        return mobile_number;
    }

    public void setMobile_number(int mobile_number) {
        this.mobile_number = mobile_number;
    }

    public Timestamp getTimeStamp() {
        return timeStamp;
    }

    public void setTimeStamp(Timestamp timeStamp) {
        this.timeStamp = timeStamp;
    }

    public int getLogin_failed() {
        return login_failed;
    }

    public void setLogin_failed(int login_failed) {
        this.login_failed = login_failed;
    }

    public java.lang.String getGroup_by() {
        return group_by;
    }

    public void setGroup_by(java.lang.String group_by) {
        this.group_by = group_by;
    }

    @Override
    public java.lang.String toString() {
        return "UserEntity{" +
                "user_id=" + user_id +
                ", user_name='" + user_name + '\'' +
                ", email='" + email + '\'' +
                ", password='" + password + '\'' +
                ", dob=" + dob +
                ", address='" + address + '\'' +
                ", mobile_number=" + mobile_number +
                ", String='" + timeStamp + '\'' +
                ", login_failed=" + login_failed +
                ", group_by='" + group_by + '\'' +
                '}';
    }
}
