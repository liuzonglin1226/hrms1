package com.test.model;

public class Recruit {
    private int r_id;
    private String r_vocation;
    private int r_age;
    private String r_sex;
    private double r_salary;
    private String r_city;
    private String r_education;
    private String r_experience;
    private int r_num;
    private Tourist tourist;
    private String r_state;

    public int getR_id() {
        return r_id;
    }

    public void setR_id(int r_id) {
        this.r_id = r_id;
    }

    public String getR_vocation() {
        return r_vocation;
    }

    public void setR_vocation(String r_vocation) {
        this.r_vocation = r_vocation;
    }

    public int getR_age() {
        return r_age;
    }

    public void setR_age(int r_age) {
        this.r_age = r_age;
    }

    public String getR_sex() {
        return r_sex;
    }

    public void setR_sex(String r_sex) {
        this.r_sex = r_sex;
    }

    public double getR_salary() {
        return r_salary;
    }

    public void setR_salary(double r_salary) {
        this.r_salary = r_salary;
    }

    public String getR_city() {
        return r_city;
    }

    public void setR_city(String r_city) {
        this.r_city = r_city;
    }

    public String getR_education() {
        return r_education;
    }

    public void setR_education(String r_education) {
        this.r_education = r_education;
    }

    public String getR_experience() {
        return r_experience;
    }

    public void setR_experience(String r_experience) {
        this.r_experience = r_experience;
    }

    public int getR_num() {
        return r_num;
    }

    public void setR_num(int r_num) {
        this.r_num = r_num;
    }

    public Tourist getTourist() {
        return tourist;
    }

    public void setTourist(Tourist tourist) {
        this.tourist = tourist;
    }

    public String getR_state() {
        return r_state;
    }

    public void setR_state(String r_state) {
        this.r_state = r_state;
    }

    @Override
    public String toString() {
        return "Recruit{" +
                "r_id=" + r_id +
                ", r_vocation='" + r_vocation + '\'' +
                ", r_age=" + r_age +
                ", r_sex='" + r_sex + '\'' +
                ", r_salary=" + r_salary +
                ", r_city='" + r_city + '\'' +
                ", r_education='" + r_education + '\'' +
                ", r_experience='" + r_experience + '\'' +
                ", r_num=" + r_num +
                ", tourist=" + tourist +
                ", r_state='" + r_state + '\'' +
                '}';
    }
}
