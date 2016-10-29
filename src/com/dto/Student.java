package com.dto;

/**
 * Created by AlvinOdins on 10/28/2016.
 */
public class Student {

    private String firstName;
    private String middleName;
    private String lastName;
    private String email;
    private String cno;
    private String dob;
    private String gender;
    private String semType;
//    private String activity;
//    private String image;

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getMiddleName() {
        return middleName;
    }

    public void setMiddleName(String middleName) {
        this.middleName = middleName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getCno() {
        return cno;
    }

    public void setCno(String cno) {
        this.cno = cno;
    }

    public String getDob() {
        return dob;
    }

    public void setDob(String dob) {
        this.dob = dob;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getSemType() {
        return semType;
    }

    public void setSemType(String semType) {
        this.semType = semType;
    }
}
