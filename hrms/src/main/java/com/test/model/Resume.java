package com.test.model;

public class Resume {
    private int re_id;
    private String re_name;
    private int re_age;
    private String re_sex;
    private String re_vocation;
    private String re_address;
    private String re_education;
    private String re_experience;
    private String re_receive;
    private int re_touristid;
    private String re_phone;
    private int re_recruitid;

    public int getRe_id() {
        return re_id;
    }

    public void setRe_id(int re_id) {
        this.re_id = re_id;
    }

    public String getRe_name() {
        return re_name;
    }

    public void setRe_name(String re_name) {
        this.re_name = re_name;
    }

    public int getRe_age() {
        return re_age;
    }

    public void setRe_age(int re_age) {
        this.re_age = re_age;
    }

    public String getRe_sex() {
        return re_sex;
    }

    public void setRe_sex(String re_sex) {
        this.re_sex = re_sex;
    }

    public String getRe_vocation() {
        return re_vocation;
    }

    public void setRe_vocation(String re_vocation) {
        this.re_vocation = re_vocation;
    }

    public String getRe_address() {
        return re_address;
    }

    public void setRe_address(String re_address) {
        this.re_address = re_address;
    }

    public String getRe_education() {
        return re_education;
    }

    public void setRe_education(String re_education) {
        this.re_education = re_education;
    }

    public String getRe_experience() {
        return re_experience;
    }

    public void setRe_experience(String re_experience) {
        this.re_experience = re_experience;
    }

    public String getRe_receive() {
        return re_receive;
    }

    public void setRe_receive(String re_receive) {
        this.re_receive = re_receive;
    }

    public int getRe_touristid() {
        return re_touristid;
    }

    public void setRe_touristid(int re_touristid) {
        this.re_touristid = re_touristid;
    }

    public String getRe_phone() {
        return re_phone;
    }

    public void setRe_phone(String re_phone) {
        this.re_phone = re_phone;
    }

    public int getRe_recruitid() {
        return re_recruitid;
    }

    public void setRe_recruitid(int re_recruitid) {
        this.re_recruitid = re_recruitid;
    }

    @Override
    public String toString() {
        return "Resume{" +
                "re_id=" + re_id +
                ", re_name='" + re_name + '\'' +
                ", re_age=" + re_age +
                ", re_sex='" + re_sex + '\'' +
                ", re_vocation='" + re_vocation + '\'' +
                ", re_address='" + re_address + '\'' +
                ", re_education='" + re_education + '\'' +
                ", re_experience='" + re_experience + '\'' +
                ", re_receive='" + re_receive + '\'' +
                '}';
    }
}
