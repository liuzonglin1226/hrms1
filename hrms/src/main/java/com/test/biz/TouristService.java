package com.test.biz;

import com.test.model.Tourist;

public interface TouristService {
    Tourist selectByName(Tourist tourist);
    Tourist selectByNameAndPass(Tourist tourist);
    void saveTourist(Tourist tourist);
}
