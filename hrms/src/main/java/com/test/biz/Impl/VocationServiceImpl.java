package com.test.biz.Impl;

import com.test.biz.VocationService;
import com.test.dao.VocationMapper;
import com.test.model.Vocation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class VocationServiceImpl implements VocationService {
    @Autowired
    private VocationMapper vocationMapper;
    @Override
    public void saveVocation(Vocation vocation) {
        vocationMapper.saveVocation(vocation);
    }

    @Override
    public void updateVocation(Vocation vocation) {
        vocationMapper.updateVocation(vocation);
    }

    @Override
    public void deleteVocation(Vocation vocation) {
        vocationMapper.deleteVocation(vocation);
    }

    @Override
    public List<Vocation> selectVocationByManagementId(int id) {
        return vocationMapper.selectVocationByManagementId(id);
    }
}
