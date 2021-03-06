package com.mastering.spring.service;

import com.mastering.spring.data.Data;
import com.mastering.spring.data.DataService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

@Service
public class BusinessServiceImpl implements BusinessService {

    @Qualifier("secondaryDataService")
    @Autowired
    private DataService dataService;

    @Override
    public long calculateSum(User user) {
        long sum = 0;
        for (Data data : this.dataService.retrieveData(user)) {
            sum += data.getValue();
        }

        return sum;
    }
}
