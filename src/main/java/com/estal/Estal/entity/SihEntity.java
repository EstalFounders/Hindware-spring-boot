package com.estal.Estal.entity;



import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "`SouthIndiaHead`")
public class SihEntity {

    @Column(name = "`index`")
    public int index;

    @Id
    @Column(name = "`sih_id`")
    public Long sihId;

    @Column(name = "`user_name`")
    public String userName;

    @Column(name = "`mobile_no`")
    public String mobileNo;

    @Column(name = "`password`")
    public String password;

    @Column(name = "`email`")
    public String email;

    public SihEntity() {

    }

    public SihEntity(int index, Long sihId, String userName, String mobileNo, String password, String email) {
        this.index = index;
        this.sihId = sihId;
        this.userName = userName;
        this.mobileNo = mobileNo;
        this.password = password;
        this.email = email;
    }

    public int getIndex() {
        return index;
    }

    public void setIndex(int index) {
        this.index = index;
    }

    public Long getSihId() {
        return sihId;
    }

    public void setSihId(Long sihId) {
        this.sihId = sihId;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getMobileNo() {
        return mobileNo;
    }

    public void setMobileNo(String mobileNo) {
        this.mobileNo = mobileNo;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public String toString() {
        return "sihEntity{" +
                "index=" + index +
                ", sihId=" + sihId +
                ", userName='" + userName + '\'' +
                ", mobileNo='" + mobileNo + '\'' +
                ", password='" + password + '\'' +
                ", email='" + email + '\'' +
                '}';
    }
}
