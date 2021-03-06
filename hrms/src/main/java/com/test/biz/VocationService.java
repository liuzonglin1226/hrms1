package com.test.biz;

import com.test.model.Vocation;

import java.util.List;

public interface VocationService {
    void saveVocation(Vocation vocation);
    void updateVocation(Vocation vocation);
    void deleteVocation(Vocation vocation);
    Vocation selectByName(Vocation vocation);
    Vocation selectByNameAndManagementId(Vocation vocation);
    List<Vocation> selectVocationByManagementId(int id);
}
