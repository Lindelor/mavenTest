package com.lind.maven.test.datasupplier.service;

import com.lind.maven.test.datasupplier.dto.RandomDataDTO;
import com.lind.maven.test.datasupplier.mapper.RandomDataMapper;
import com.lind.maven.test.datasupplier.model.RandomDataModel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class RandomDataServiceImpl implements RandomDataService {

    private final RandomDataMapper randomDataMapper;

    @Autowired
    public RandomDataServiceImpl(RandomDataMapper randomDataMapper) {
        this.randomDataMapper = randomDataMapper;
    }

    @Override
    public RandomDataDTO getRandomData() {
        var randomDataModel = new RandomDataModel();
        return randomDataMapper.map(randomDataModel);
    }
}
