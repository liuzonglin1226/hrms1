package com.test.dao;

import com.test.model.Recruit;

import java.util.List;

public interface RecruitMapper {
    List<Recruit> getRecruit();
    Recruit selectById(int id);
    Recruit selectByVocation(String vocation);
    void saveRecruit(Recruit recruit);
    void updateRecruit(Recruit recruit);
    void deleteRecruit(Recruit recruit);
}
