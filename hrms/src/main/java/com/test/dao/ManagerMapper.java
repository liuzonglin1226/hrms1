package com.test.dao;

import com.test.model.Manager;

public interface ManagerMapper {
    Manager selectByNameAndPass(Manager manager);
}
