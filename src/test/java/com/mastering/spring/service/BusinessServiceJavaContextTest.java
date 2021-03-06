package com.mastering.spring.service;

import com.mastering.spring.config.SpringContextConfiguration;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringRunner;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.*;

@RunWith(SpringRunner.class)
@ContextConfiguration(classes = { SpringContextConfiguration.class })
public class BusinessServiceJavaContextTest {
    @Autowired
    private BusinessService businessService;

    @Test
    public void testCalculateSum() {
        long sum = this.businessService.calculateSum(new User());
        assertThat(sum, is(20L));
    }
}