package com.test.biz;

import com.test.model.Manager;

public interface ManagerService {
    Manager selectByNameAndPass(Manager manager);
}
