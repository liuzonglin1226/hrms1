package com.test.biz.Impl;

import com.test.biz.ManagerService;
import com.test.dao.ManagerMapper;
import com.test.model.Manager;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ManagerServiceImpl implements ManagerService {
    @Autowired
    private ManagerMapper managerMapper;
    @Override
    public Manager selectByNameAndPass(Manager manager) {
        return managerMapper.selectByNameAndPass(manager);
    }
}
