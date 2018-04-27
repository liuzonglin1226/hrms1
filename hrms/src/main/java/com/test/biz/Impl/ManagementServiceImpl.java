package com.test.biz.Impl;

import com.test.biz.ManagementService;
import com.test.dao.ManagementMapper;
        import com.test.dao.ManagerMapper;
        import com.test.model.Management;
        import org.springframework.beans.factory.annotation.Autowired;
        import org.springframework.stereotype.Service;

        import java.util.List;

@Service
public class ManagementServiceImpl implements ManagementService {
    @Autowired
    private ManagementMapper managementMapper;
    @Override
    public void saveManagement(Management management) {
        managementMapper.saveManagement(management);
    }

    @Override
    public void updateManagement(Management management) {
        managementMapper.updateManagement(management);
    }

    @Override
    public void deleteManagement(Management management) {
        managementMapper.deleteManagement(management);
    }

    @Override
    public List<Management> selectManagement() {
        return managementMapper.selectManagement();
    }

    @Override
    public Management selectByName(Management management) {
        return managementMapper.selectByName(management);
    }

    @Override
    public Management selectById(Management management) {
        return managementMapper.selectById(management);
    }
}
