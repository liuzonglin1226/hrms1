package com.test.dao;

import com.test.model.Vocation;

import java.util.List;

public interface VocationMapper {
    void saveVocation(Vocation vocation);
    void updateVocation(Vocation vocation);
    void deleteVocation(Vocation vocation);
    List<Vocation> selectVocationByManagementId(int id);
}
