package com.test.biz;

import com.test.model.Management;

import java.util.List;

public interface ManagementService {
    void saveManagement(Management management);
    void updateManagement(Management management);
    void deleteManagement(Management management);
    List<Management> selectManagement();
    Management selectByName(Management management);
    Management selectById(Management management);
}
