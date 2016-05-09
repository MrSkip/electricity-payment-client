package com.kursova.kep.entity;

import java.sql.Date;

public class Subscribers extends BaseWithName {

    private Integer personalAccount;
    private String lastName;
    private Date birsday;
    private String sex;
    private String typeOfSettlement;
    private String nameOfSettelement;
    private String addres;
    private Integer phoneNumber;
    private String benefits;

    public Subscribers() {
    }

    public Subscribers(
            Long id,
            Integer personalAccount,
            String lastName,
            String firstName,
            Date birsday,
            String sex,
            String typeOfSettlement,
            String nameOfSettelement,
            String addres,
            Integer phoneNumber,
            String benefits
    ) {
        this.id = id;
        this.personalAccount = personalAccount;
        this.lastName = lastName;
        this.firstName = firstName;
        this.birsday = birsday;
        this.sex = sex;
        this.typeOfSettlement = typeOfSettlement;
        this.nameOfSettelement = nameOfSettelement;
        this.addres = addres;
        this.phoneNumber = phoneNumber;
        this.benefits = benefits;
    }

    @Override
    public Long getId() {
        return super.getId();
    }

    @Override
    public void setId(Long id) {
        super.setId(id);
    }

    public Integer getPersonalAccount() {
        return personalAccount;
    }

    public void setPersonalAccount(Integer personalAccount) {
        this.personalAccount = personalAccount;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public Date getBirsday() {
        return birsday;
    }

    public void setBirsday(Date birsday) {
        this.birsday = birsday;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public String getTypeOfSettlement() {
        return typeOfSettlement;
    }

    public void setTypeOfSettlement(String typeOfSettlement) {
        this.typeOfSettlement = typeOfSettlement;
    }

    public String getNameOfSettelement() {
        return nameOfSettelement;
    }

    public void setNameOfSettelement(String nameOfSettelement) {
        this.nameOfSettelement = nameOfSettelement;
    }

    public String getAddres() {
        return addres;
    }

    public void setAddres(String addres) {
        this.addres = addres;
    }

    public Integer getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(Integer phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getBenefits() {
        return benefits;
    }

    public void setBenefits(String benefits) {
        this.benefits = benefits;
    }
}
