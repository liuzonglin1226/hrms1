package com.test.model;

public class Tourist {
    private int t_id;
    private String t_name;
    private String t_pass;
    private Recruit recruit;

    public Tourist() {
    }

    public Tourist(int t_id, String t_name, String t_pass) {
        this.t_id = t_id;
        this.t_name = t_name;
        this.t_pass = t_pass;
    }

    public int getT_id() {
        return t_id;
    }

    public void setT_id(int t_id) {
        this.t_id = t_id;
    }

    public String getT_name() {
        return t_name;
    }

    public void setT_name(String t_name) {
        this.t_name = t_name;
    }

    public String getT_pass() {
        return t_pass;
    }

    public void setT_pass(String t_pass) {
        this.t_pass = t_pass;
    }

    public Recruit getRecruit() {
        return recruit;
    }

    public void setRecruit(Recruit recruit) {
        this.recruit = recruit;
    }

    @Override
    public String toString() {
        return "Tourist{ t_name='" + t_name + '\'' +
                ", t_pass='" + t_pass + '\'' +
                '}';
    }
}
