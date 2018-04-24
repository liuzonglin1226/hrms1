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
}
