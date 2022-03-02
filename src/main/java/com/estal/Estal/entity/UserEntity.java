package com.estal.Estal.entity;



import org.hibernate.annotations.CreationTimestamp;
import org.springframework.beans.factory.annotation.Value;

import javax.persistence.*;
import java.sql.Time;
import java.sql.Timestamp;
import java.util.Date;

@Entity
@Table(name = "`USER_SIGNUP`")
public class UserEntity {

    @Column(name = "`index`")
    public int index;

    @Id
    @Column(name = "`user_id`")
    public Long user_id;

    @Column(name = "`name`")
    public String user_name;

    @Column(name = "`email`")
    public String email;

    @Column(name = "`password`")
    public String password;

    @Column(name = "`DOB`")
    @CreationTimestamp
    public Date dob;

    @Column(name = "`address`")
    public String address;

    @Column(name = "`mobile_no`")
    public int mobile_number;

    @Column(name = "`time`")
    public Time time;

    @Column(name = "`group_by`")
    public String group_by;

    @Column(name = "`Created_at`")
    public String created_at;

    public UserEntity() {
    }

    public UserEntity(int index, Long user_id, String user_name, String email, String password, Date dob, String address, int mobile_number, Time time) {
        this.index = index;
        this.user_id = user_id;
        this.user_name = user_name;
        this.email = email;
        this.password = password;
        this.dob = dob;
        this.address = address;
        this.mobile_number = mobile_number;
        this.time = time;
    }

    public int getIndex() {
        return index;
    }

    public void setIndex(int index) {
        this.index = index;
    }

    public Long getUser_id() {
        return user_id;
    }

    public void setUser_id(Long user_id) {
        this.user_id = user_id;
    }

    public String getUser_name() {
        return user_name;
    }

    public void setUser_name(String user_name) {
        this.user_name = user_name;
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

    public Date getDob() {
        return dob;
    }

    public void setDob(Date dob) {
        this.dob = dob;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public int getMobile_number() {
        return mobile_number;
    }

    public void setMobile_number(int mobile_number) {
        this.mobile_number = mobile_number;
    }

    public Time getTime() {
        return time;
    }

    public void setTime(Time time) {
        this.time = time;
    }

    public String getGroup_by() {
        return group_by;
    }

    public void setGroup_by(String group_by) {
        this.group_by = group_by;
    }

    public String getCreated_at() {
        return created_at;
    }

    public void setCreated_at(String created_at) {
        this.created_at = created_at;
    }

    @Override
    public String toString() {
        return "UserEntity{" +
                "index=" + index +
                ", user_id=" + user_id +
                ", user_name='" + user_name + '\'' +
                ", email='" + email + '\'' +
                ", password='" + password + '\'' +
                ", dob=" + dob +
                ", address='" + address + '\'' +
                ", mobile_number=" + mobile_number +
                ", time=" + time +
                ", group_by='" + group_by + '\'' +
                ", created_at='" + created_at + '\'' +
                '}';
    }
}
