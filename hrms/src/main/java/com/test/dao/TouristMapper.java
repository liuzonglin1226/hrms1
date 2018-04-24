package com.test.dao;

import com.test.model.Tourist;

public interface TouristMapper {
    Tourist selectByName(Tourist tourist);
    Tourist selectByNameAndPass(Tourist tourist);
    void saveTourist(Tourist tourist);
}
