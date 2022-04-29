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
    public Date dob;

    @Column(name = "`address`")
    public String address;

    @Column(name = "`mobile_no`")
    public String mobile_no;

    @Column(name = "`time`")
    public Timestamp timeStamp;
    public Timestamp timestamp;

    @Column(name = "`group_by`")
    public String group_by;

    @Column(name = "`Created_at`")
    public String created_at;

    public UserEntity() {

    }

    public UserEntity(int index, Long user_id, String user_name, String email, String password, Date dob, String address, String mobile_no, Timestamp timeStamp, Timestamp timestamp, String group_by, String created_at) {
        this.index = index;
        this.user_id = user_id;
        this.user_name = user_name;
        this.email = email;
        this.password = password;
        this.dob = dob;
        this.address = address;
        this.mobile_no = mobile_no;
        this.timeStamp = timeStamp;
        this.timestamp = timestamp;
        this.group_by = group_by;
        this.created_at = created_at;
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

    public String getMobile_no() {
        return mobile_no;
    }

    public void setMobile_no(String mobile_no) {
        this.mobile_no = mobile_no;
    }

    public Timestamp getTimeStamp() {
        return timeStamp;
    }

    public void setTimeStamp(Timestamp timeStamp) {
        this.timeStamp = timeStamp;
    }

    public Timestamp getTimestamp() {
        return timestamp;
    }

    public void setTimestamp(Timestamp timestamp) {
        this.timestamp = timestamp;
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
                ", mobile_no='" + mobile_no + '\'' +
                ", timeStamp=" + timeStamp +
                ", timestamp=" + timestamp +
                ", group_by='" + group_by + '\'' +
                ", created_at='" + created_at + '\'' +
                '}';
    }
}
