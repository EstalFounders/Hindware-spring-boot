package com.hindware.hindware.entity;



import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "`asm`")
public class AsmEntity {

    @Column(name = "`index`")
    public int index;

    @Id
    @Column(name = "`asm_id`")
    public Long asmId;

    @Column(name = "`user_name`")
    public String userName;

    @Column(name = "`mobile_no`")
    public String mobileNo;

    @Column(name = "`password`")
    public String password;

    @Column(name = "`email`")
    public String email;

    @Column(name = "`city`")
    public String city;

    @Column(name = "`state`")
    public String state;

    @Column(name = "`rep_manager`")
    public String rep_manager;


    public AsmEntity() {

    }

    public AsmEntity(int index, Long sihId, String userName, String mobileNo, String password, String email, String city, String state, String rep_manager) {
        this.index = index;
        this.asmId = sihId;
        this.userName = userName;
        this.mobileNo = mobileNo;
        this.password = password;
        this.email = email;
        this.city = city;
        this.state = state;
        this.rep_manager = rep_manager;
    }

    public int getIndex() {
        return index;
    }

    public void setIndex(int index) {
        this.index = index;
    }

    public Long getAsmId() {
        return asmId;
    }

    public void setAsmId(Long asmId) {
        this.asmId = asmId;
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

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public String getRep_manager() {
        return rep_manager;
    }

    public void setRep_manager(String rep_manager) {
        this.rep_manager = rep_manager;
    }

    @Override
    public String toString() {
        return "zonalManagerEntity{" +
                "index=" + index +
                ", asmId=" + asmId +
                ", userName='" + userName + '\'' +
                ", mobileNo='" + mobileNo + '\'' +
                ", password='" + password + '\'' +
                ", email='" + email + '\'' +
                ", city='" + city + '\'' +
                ", state='" + state + '\'' +
                ", rep_manager='" + rep_manager + '\'' +
                '}';
    }
}
