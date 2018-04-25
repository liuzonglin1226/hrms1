package com.test.biz.Impl;

import com.test.biz.RecruitService;
import com.test.dao.RecruitMapper;
import com.test.model.Recruit;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class RecruitServiceImpl implements RecruitService {
    @Autowired
    private RecruitMapper recruitMapper;
    @Override
    public List<Recruit> getRecruit() {
        return recruitMapper.getRecruit();
    }

    @Override
    public Recruit selectById(int id) {
        return recruitMapper.selectById(id);
    }

    @Override
    public Recruit selectByVocation(String vocation) {
        return recruitMapper.selectByVocation(vocation);
    }

    @Override
    public void saveRecruit(Recruit recruit) {
        recruitMapper.saveRecruit(recruit);
    }

    @Override
    public void updateRecruit(Recruit recruit) {
        recruitMapper.updateRecruit(recruit);
    }

    @Override
    public void deleteRecruit(Recruit recruit) {
        recruitMapper.deleteRecruit(recruit);
    }
}
