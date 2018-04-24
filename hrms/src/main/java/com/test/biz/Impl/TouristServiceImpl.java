package com.test.biz.Impl;

import com.test.biz.TouristService;
import com.test.dao.TouristMapper;
import com.test.model.Tourist;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class TouristServiceImpl implements TouristService {
    @Autowired
    private TouristMapper touristMapper;

    @Override
    public Tourist selectByName(Tourist tourist) {
        return touristMapper.selectByName(tourist);
    }

    @Override
    public Tourist selectByNameAndPass(Tourist tourist) {
        return touristMapper.selectByNameAndPass(tourist);
    }

    @Override
    public void saveTourist(Tourist tourist) {
        touristMapper.saveTourist(tourist);
    }
}
